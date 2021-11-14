package mate_jv_core;

import java.util.Arrays;

public class MatrixDiagonal {
    public static int[] getDiagonal(int[][] matrix) {
        int size = matrix.length;
        int[] d = new int[size];
        for (int i = 0; i < size; i++) {
            d[i] = matrix[i][i];
        }
        return d;
    }

    public static int[] getCounterDiagonal(int[][] matrix) {
        int size = matrix.length;
        int[] d = new int[size];
        for (int i = 0; i < size; i++) {
            int inv = size - i - 1;
            d[i] = matrix[i][inv];
        }
        return d;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2},
                {4, 5, 6},
                {1, 1, 1}};
        System.out.println(Arrays.toString(getDiagonal(matrix)));
        System.out.println(Arrays.toString(getCounterDiagonal(matrix)));
    }
}
