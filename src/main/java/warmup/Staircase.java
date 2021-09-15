package warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */

public class Staircase {

    private static void print(char c) {
        System.out.print(c);
    }

    private static char symbol(int x, int y, int n) {
        return x < n - y - 1? ' ' : '#';
    }

    private static void staircase(int n) {
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                print(symbol(x, y, n));
            }
                print('\n');
        }
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);
        scanner.close();
    }
}
