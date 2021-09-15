package warmup;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */

public class PlusMinus {

    static void plusMinusv1(int[] arr) {
        int[] counters = {0, 0, 0};

        for (int a : arr) {
            if (a > 0) counters[0]++;
            else if (a < 0) counters[1]++;
            else counters[2]++;
        }

        for (int counter : counters) {
            double r = (double) counter / arr.length;
            System.out.printf("%.6f\n", r);
        }

    }

    static long filter(int[] a, IntPredicate f) {
        return Arrays.stream(a).filter(f).sum();
    }

    static double ratio(long n, int total) {
        return (double) n / total;
    }

    static void plusMinusv2(int[] arr) {
        double[] ratios = new double[3];
        int len = arr.length;

        long gt0 = filter(arr, x -> x > 0);
        long lt0 = filter(arr, x -> x < 0);
        long eq0 = len - gt0 - lt0;

        ratios[0] = ratio(gt0, len);
        ratios[1] = ratio(lt0, len);
        ratios[2] = ratio(eq0, len);

        for (double r : ratios) System.out.printf("%f\n", r);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinusv1(arr);

        scanner.close();
    }
}
