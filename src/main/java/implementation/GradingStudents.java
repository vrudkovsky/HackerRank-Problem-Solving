package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {

    public static int round(int x) {
        return Math.round(x / 5) * 5 + 5;
    }

    public static boolean isModified(int x) {
        return x > 37 && round(x) - x < 3;
    }

    public static int modify(int x) {
        return round(x);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(x -> isModified(x) ? modify(x) : x).collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = gradingStudents(grades);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
                + "\n");

        bufferedReader.close();
    }
}
