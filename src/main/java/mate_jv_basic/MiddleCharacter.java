package mate_jv_basic;

/**
 * Створи метод getMiddleCharacter(), що приймає рядок і повертає центральний символ
 * (або 2 центральних символи, якщо довжина рядка парна) у вигляді рядка.
 */

public class MiddleCharacter {
    public static String getMiddleCharacter(String s) {
        char[] cs = s.toCharArray();
        int mid = cs.length / 2;
        StringBuilder sb = new StringBuilder();
        if (s.equals("") || s == null) return "";
        if (cs.length % 2 == 0) {
            sb.append(cs[mid - 1]);
            sb.append(cs[mid]);
            return String.valueOf(sb);
        } else {
            return String.valueOf(cs[mid]);
         }
    }

    public static void main(String[] args) {
        System.out.println(getMiddleCharacter("kangaroo"));
    }
}
