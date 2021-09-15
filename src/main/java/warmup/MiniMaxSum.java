package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long minSum = arr.stream().mapToLong(v -> v).sorted().limit(arr.size() - 1).sum();
        long maxSum = arr.stream().mapToLong(v -> v).sorted().skip(1).sum();
        System.out.printf("%d %d", minSum, maxSum);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
