package Mate;

import java.util.Arrays;

/**
 * Створи метод markStringEnds(), що приймає рядок і повертає масив String[] з двох елементів:
 * з першим і останнім символами у верхньому регістрі.
 */

public class MarkStringEnds {

    public static boolean isLowerCase(char c) {
        return c >= 97 && c <= 122;
    }

    public static char toUpperCase(char c) {
        return (char) (c - 32);
    }

    public static String[] markStringEnds(String s) {
        String[] str = new String[2];
        char[] cs1 = s.toCharArray();
        char[] cs2 = s.toCharArray();
        int l = cs1.length;

        if (isLowerCase(cs1[0])) {
            cs1[0] = toUpperCase(cs1[0]);
        }
        str[0] = String.valueOf(cs1);

        if (isLowerCase(cs2[l - 1])) {
            cs2[l - 1] = toUpperCase(cs2[l - 1]);
        }
        str[1] = String.valueOf(cs2);

        return str;
    }

    public static void main(String[] args) {
        String[] as = markStringEnds("ALICE");
        System.out.println(Arrays.deepToString(as));
    }
}
