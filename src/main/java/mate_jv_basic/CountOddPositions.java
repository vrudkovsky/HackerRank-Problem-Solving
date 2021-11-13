package mate_jv_basic;

/**
 * Count chars of strings placed in the odd positions in the given array.
 *
 * If the input array is empty, return 0.
 */

public class CountOddPositions {
    public static int countOddPositionChars(String[] array) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (array == null || array.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                count += array[i].length();
            }
        }
        return count;
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    public static void main(String[] args) {
        System.out.println(countOddPositionChars(new String[]{"Hello", "world", "from", "array"}));
    }
}

//    countOddPositionChars(["Hello", "world", "from", "array"]) => 9
//    Sum of lengthes of "Hello" and "from": 5 + 4 = 9
//    "world" and "array" are skipped because they are on the even positions