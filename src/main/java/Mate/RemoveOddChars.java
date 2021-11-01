package Mate;

/**
 * Створи метод removeOddChars(), що приймає рядок і повертає його, перед цим видаливши непарні символи.
 * Непарні символи - такі, що розташовані на непарних індексах у рядку.
 */
public class RemoveOddChars {
    public static String removeOddChars(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                sb.append(chars[i]);
            }
        }
        return String.valueOf(sb);
    }
    public static void main(String[] args) {
        System.out.println(removeOddChars("hello"));
    }
}
