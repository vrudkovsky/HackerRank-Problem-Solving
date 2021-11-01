package Mate;

/**
 * Implement method that takes String as an input and returns its last character.
 */

public class StringLastCharacter {
    public static char getLastCharacter(String input) {
        // WRITE YOUR CODE BELOW THIS LINE
        return input.charAt(input.length() - 1);
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    public static void main(String[] args) {
        System.out.printf("%c\n", getLastCharacter("a"));
        System.out.printf("%c\n", getLastCharacter("abcde"));
        System.out.printf("%c\n", getLastCharacter("12345"));
    }
}
