package mate_jv_basic;

import java.util.Arrays;

public class MaxElement2DArray{
    public static int getMaxElementv1(int[][] matrix) {
        return Arrays.stream(Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray())
                .max().getAsInt();
    }

    public static int getMaxElementv2(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] n : matrix) {
            for (int m : n) {
                if (m > max) {
                    max = m;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1},
                {42, 3},
                {10, 12, 41},
        };
        System.out.println(getMaxElementv1(matrix));
        System.out.println(getMaxElementv2(matrix));
    }
}
