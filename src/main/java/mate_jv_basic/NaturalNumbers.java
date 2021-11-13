package mate_jv_basic;

public class NaturalNumbers {
    public static int getSum(int n) {
        // WRITE YOUR CODE BELOW THIS LINE
        int sum = 0;
        if (n < 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.printf("%d\n", getSum(3));
    }
}
