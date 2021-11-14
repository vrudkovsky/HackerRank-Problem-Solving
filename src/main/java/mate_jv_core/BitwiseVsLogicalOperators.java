package mate_jv_core;

/**
 * Your task is to fix code in the method executeExpression().
 *
 * Now this method throws ArithmeticException when the input parameter a is equal to zero (int a = 0).
 *
 * Think about how to fix this code - if we do not evaluate the right side of the expression, we will not get an exception.
 */

public class BitwiseVsLogicalOperators {
    public boolean executeExpression(int a, int b) {
        return (a != 0) & (a << 1 == b);
    }
//VS
    public boolean executeExpressionv1(int a, int b) {
        return (a != 0) & (b / a == 2) ;
    }

    public static void main(String[] args) {
        Integer.toBinaryString(5);
    }
}
