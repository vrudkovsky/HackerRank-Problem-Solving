package mate_jv_basic;

import java.util.Arrays;

/**
 * Реалізуй метод countTheMonkeys(int count),
 * що повертає масив int[], який містить значення від 1 і до count.
 */

public class TheMonkeys {
    public static int[] countTheMonkeys(int count) {
        // write your code here
        int[] res = new int[count];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countTheMonkeys(5)));
        System.out.println(Arrays.toString(countTheMonkeys(8)));
        System.out.println(Arrays.toString(countTheMonkeys(1)));
        System.out.println(Arrays.toString(countTheMonkeys(0)));
    }
}
