package mate_jv_core;

/**
 * Implement the booleanExpression(boolean a, boolean b, boolean c, boolean d) method which returns true if any two of its four arguments are true and rest have false value. In all other cases, the method must return false.
 *
 * You only need to analyze the values (a, b, c, d) transferred to the booleanExpression() method and return the result.
 *
 * This problem must be solved using logical operators. Don't use if-else/switch-case constructions or ternary operators.
 *
 */

public class BooleanExpression {

    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        //write code below this line
        return (a ^ b && c ^ d) || (a ^ c && b ^ d);
//        return (a | b | c | d) && !(a & b & c & d) && !(a ^ b ^ c ^ d);
        //write code above this line
    }

    public static void main(String[] args) {

    }
}
