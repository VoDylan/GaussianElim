import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double[] r1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2047};
        double[] r2 = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3};
        double[] r3 = {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 12};
        double[] r4 = {0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 48};
        double[] r5 = {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 384};
        double[] r6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1536};
        double[] r7 = {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 5};
        double[] r8 = {0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 50};
        double[] r9 = {0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1952};
        double[] r10 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 4083};
        double[] r11 = {11, -10, 9, -8, 7, -6, 5, -4, 3, -2, 1, 459};

        List<double[]> Matrix = Arrays.asList(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        //System.out.println(Matrix.size());
        GaussianElimination.RREF(Matrix);
        //System.out.println(GaussianElimination.rowSubtraction(r1, r11, 11));

    }
}