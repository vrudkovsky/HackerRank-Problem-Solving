package Mate;

/**
 * Реалізуй метод getOccurrenceCount(String[] colors, String targetColor),
 * що повертає кількість разів, яку targetColor зустрічається в масиві colors.
 */

public class OccurrenceCount {

    public static int getOccurrenceCount(String[] colors, String targetColor) {
        // write your code here
        int count = 0;
        for (String s : colors) {
            if (s.equals(targetColor)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int c1 = getOccurrenceCount(new String[]{"blue", "blue", "blue"}, "blue");
        int c2 = getOccurrenceCount(new String[]{"blue", "green", "red"}, "red");
        int c3 = getOccurrenceCount(new String[]{"blue", "green", "red"}, "white");
        int c4 = getOccurrenceCount(new String[]{"blue", "green", "red"}, null);
        int c5 = getOccurrenceCount(new String[0], "blue");
        System.out.printf("%d %d %d %d %d\n", c1, c2, c3, c4, c5);
    }
}
