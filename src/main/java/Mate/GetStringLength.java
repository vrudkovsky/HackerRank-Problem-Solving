package Mate;

/**
 * Implement method stringLength(), which takes String as an argument and returns its length.
 */

public class GetStringLength {
    public static int stringLength(String input) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (input == null) {
            return 0;
        }
        return input.length();
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    public static void main(String[] args) {
        System.out.printf("%d\n", stringLength(null));
        System.out.printf("%d\n", stringLength(""));
        System.out.printf("%d\n", stringLength("AAA"));
    }

}
