package warmup;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

public class CompareTriplets {

    static class Counter {
        int cnt1;
        int cnt2;

        Counter() {
            this.cnt1 = 0;
            this.cnt2 = 0;
        }

        Counter(int cnt1, int cnt2) {
            this.cnt1 = cnt1;
            this.cnt2 = cnt2;
        }

        static Counter fromComp(int c) {
            return new Counter(c > 0 ? 1 : 0, c < 0 ? 1 : 0);
        }

        static Counter zero() {
            return new Counter(0, 0);
        }

        public List<Integer> toList() {
            return Arrays.asList(cnt1, cnt2);
        }
    }

    public static List<Integer> comparev1(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(0);

        int acnt = 0;
        int bcnt = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                acnt++;
                c.set(0,acnt);
            }
            if (a.get(i) < b.get(i)) {
                bcnt++;
                c.set(1,bcnt);
            }
        }
        return c;
    }

    public static List<Integer> comparev2(List<Integer> a, List<Integer> b) {
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < a.size(); i++) {
            cnt1 += a.get(i) > b.get(i)? 1 : 0;
            cnt2 += a.get(i) < b.get(i)? 1 : 0;
        }

        return Arrays.asList(cnt1, cnt2);
    }

    public static List<Integer> comparev3(List<Integer> a, List<Integer> b) {
        Counter c = new Counter();
        IntStream.range(0, a.size()).forEach(i -> {
            c.cnt1 += a.get(i) > b.get(i)? 1 : 0;
            c.cnt2 += a.get(i) < b.get(i)? 1 : 0;
        });
        return Arrays.asList(c.cnt1, c.cnt2);
    }

    public static List<Integer> comparev4(List<Integer> a, List<Integer> b) {
        return IntStream.range(0, a.size()).mapToObj(i ->
                new Counter(
                    a.get(i) > b.get(i)? 1 : 0,
                    a.get(i) < b.get(i)? 1 : 0
                )).reduce((c1, c2) -> new Counter(c1.cnt1 + c2.cnt1, c1.cnt2 + c2.cnt2))
                .orElseThrow(RuntimeException::new)
                .toList();
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

//        List<Integer> resultv1 = comparev1(a, b);
//        List<Integer> resultv2 = comparev2(a, b);
        List<Integer> resultv4 = comparev4(a, b);

        System.out.println(resultv4.stream()
                .map(Object::toString)
                .collect(joining(" ")) + "\n");
    }
}
