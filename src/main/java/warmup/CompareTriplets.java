package warmup;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compare(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(0);
        int acount = 0;
        int bcount = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                acount++;
                c.set(0,acount);
            }
            if (a.get(i) < b.get(i)) {
                bcount++;
                c.set(1,bcount);
            }
        }

        return c;
    }

}

public class CompareTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.compare(a, b);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n");
    }
}
