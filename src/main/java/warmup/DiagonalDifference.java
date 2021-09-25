package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {


        public static int[][] convert(List<List<Integer>> a) {
            int size = a.size();
            int[][] res = new int[size][size];

            IntStream.range(0, size).forEach(y ->
                    IntStream.range(0, size).forEach(x ->
                            res[y][x] = a.get(y).get(x)));
            return res;
        }

        public static int resultv1(List<List<Integer>> arr) {
            int[][] a = convert(arr);
            int d1 = 0;
            int d2 = 0;
            int size = a.length;
            int res = 0;

            for (int i = 0; i < size; i++) {
                d1 = d1 + a[i][i];
            }

            for (int i = 0; i < size; i++) {
                int i_inv = size - i -1;
                d2 = d2 + a[i][i_inv];
            }

            res = Math.abs(d1 - d2);

            return res;
        }

    public static int resultv2(List<List<Integer>> arr) {
        int[][] a = convert(arr);
        int d1 = 0;
        int d2 = 0;
        int size = a.length;
        int res = 0;

        for (int i = 0; i < size; i++) {
            d1 += a[i][i];
            d2 += a[i][size - i -1];
        }

        res = Math.abs(d1 - d2);
        return res;
    }

    public static int resultv3(List<List<Integer>> arr) {
        int[][] a = convert(arr);
        int diff = 0;
        int size = a.length;

        for (int i = 0; i < size; i++) {
            diff += a[i][i] - a[i][size - i -1];
        }

        return Math.abs(diff);
    }

    public static int resultv4(List<List<Integer>> arr) {
        int[][] a = convert(arr);
        int size = a.length;
        int diff = IntStream.range(0, size)
                .map(i -> a[i][i] - a[i][size - i -1])
                .reduce(0, (r, item) -> r + item);
        return Math.abs(diff);
    }

    public static int resultv5(List<List<Integer>> arr) {
        int size = arr.size();
        int diff = IntStream.range(0, size)
                .map(i -> arr.get(i).get(i) - arr.get(i).get(size - i -1))
                .reduce(0, (r, item) -> r + item);
        return Math.abs(diff);
    }

    public static int resultv6(List<List<Integer>> arr) {
        return Math.abs(IntStream.range(0, arr.size())
                .map(i -> arr.get(i).get(i) - arr.get(i).get(arr.size() - i -1))
                .reduce(0, (r, item) -> r + item));
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        int result = resultv1(arr);
        System.out.println(result);

        bufferedReader.close();
    }

}
