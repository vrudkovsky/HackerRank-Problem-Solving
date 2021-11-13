package mate_jv_basic;

/**
 * Implement method that takes an array of integers and returns the smallest element of the array.
 *
 * If the input array is empty, return 0.
 */

public class FindSmallestElement {
    public static int findSmallestElement(int[] nums) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    public static void main(String[] args) {
        int se1 = findSmallestElement(new int[]{0});// => 0
        int se2 = findSmallestElement(new int[]{1, 1, 1});// => 1
        int se3 = findSmallestElement(new int[]{-1, -4, -3, -2});// => -4
        System.out.printf("%d\n", se1);
        System.out.printf("%d\n", se2);
        System.out.printf("%d\n", se3);
    }
}
