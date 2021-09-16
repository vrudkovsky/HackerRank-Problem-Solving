package implementation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */

public class NumberLineJumps {

    static String represent(boolean r) {
        return r ? "YES" : "NO";
    }

    static boolean canMeet(int x1, int v1, int x2, int v2) {
        double v = (double) (x2-x1) / (v1-v2);
        return (int) v == v;
    }

    static boolean canBeSolved(int x1, int v1, int x2, int v2) {
        return (x2>x1 && v1>v2) || (x2<x1 && v1<v2) || (x1==x2 && v1==v2);
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean r = canBeSolved(x1, v1, x2, v2) && canMeet(x1, v1, x2, v2);
        return represent(r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.printf("%s\n", result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
