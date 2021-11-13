package mate_jv_basic;

import java.util.Arrays;

/**
 * Given a sentence. Find the longest word in that sentence and return it's length.
 */

public class LongestWord {
    public static int findLongest(String sentence) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (sentence == null) {
            return 0;
        }
        int max = 0;
        String[] split = sentence.replaceAll("\\. ", "").split("\\s");
        for (String s : split) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    public static void main(String[] args) {
//        String[] split = "Find the longest word in that sentence and return it's length.".split("\\s");
        String s = "Find the longest word, in that sentence and return it's length.".replaceAll("\\. ", "");
        String[] split = s.split("\\s");
        System.out.printf("%s\n", s);
        System.out.println(Arrays.toString(split));
    }
}
