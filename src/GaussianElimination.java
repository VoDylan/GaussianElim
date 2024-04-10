import java.util.List;
import java.lang.Math;
import java.util.Arrays;

public class GaussianElimination {
    public static List<double[]> RREF(List<double[]> Matrix) {
        //REF
        for (int i = 0; i < Matrix.size() - 1; i++) { //all rows
            int pivotRow = i;
            for (int j = i + 1; j < Matrix.size(); j++) {// column
                if (Math.abs(Matrix.get(j)[i]) > Math.abs(Matrix.get(pivotRow)[i])) { //find max
                    pivotRow = j;
                }
            }
            //swap rows
            double[] temp = Matrix.get(pivotRow);
            Matrix.set(pivotRow, Matrix.get(i));
            Matrix.set(i, temp);
            for (int k = i + 1; k < Matrix.size(); k++) {
                //row subtraction
                double coefficient = Matrix.get(k)[i] / Matrix.get(i)[i];
                double[] tempRow = Matrix.get(i).clone();
                for (int j = 0; j < tempRow.length; j++) {
                    tempRow[j] = Matrix.get(k)[j] - (Matrix.get(i)[j] * coefficient);
                }
                Matrix.set(k, tempRow);
            }
            //print array
            for (int z = 0; z < Matrix.size(); z++) {
                System.out.println(Arrays.toString(Matrix.get(z)));
            }
            System.out.println("\n");
        }

        //RREF
        for (int i = Matrix.size() - 1; i >= 0; i--) {
            double pivotCoeff = 1 / Matrix.get(i)[i];
            double[] tempRow = Matrix.get(i).clone();
            for (int j = 0; j < Matrix.size() + 1; j++) {
                tempRow[j] = (Matrix.get(i)[j] * pivotCoeff);
            }
            Matrix.set(i, tempRow);
        }
        for (int i = Matrix.size() - 1; i > 0; i--) {
            for (int k = i; k > 0; k--) {
                double coeff = Matrix.get(k - 1)[i] / Matrix.get(i)[i];
                double[] tempRow = Matrix.get(k).clone();
                for (int j = 0; j < Matrix.size() + 1; j++) {
                    tempRow[j] = Matrix.get(k - 1)[j] - (Matrix.get(i)[j] * coeff);
                }
                Matrix.set(k - 1, tempRow);
            }
        }
        //print array

        List<int[]> newMatrix = Arrays.asList(
                new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0});
        for (int i = 0; i < newMatrix.size(); i++) {
            int[] tempRow = newMatrix.get(i).clone();
            tempRow[newMatrix.get(i).length - 1] = (int) Math.round(Matrix.get(i)[newMatrix.get(i).length - 1]);
            newMatrix.set(i, tempRow);
        }

        //print array
        for (int z = 0; z < newMatrix.size(); z++) {
            System.out.println(Arrays.toString(newMatrix.get(z)));
        }
        System.out.println("\n");

        //print diagonal
        for (int i = 0; i < newMatrix.size(); i++) {
            System.out.println("X" + i + " = " + newMatrix.get(i)[newMatrix.get(i).length - 1]);
        }

        return Matrix;
    }
}
