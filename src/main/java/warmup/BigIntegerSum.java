package warmup;

import java.math.BigInteger;

public class BigIntegerSum {
    public static String repeat(int x, int y) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x - y; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "1311";
        String b = "9010";

        //processing
        String a1 = a.length() >= b.length() ? a : repeat(b.length(), a.length()) + a;
        String b1 = b.length() >= a.length() ? b : repeat(a.length(), b.length()) + b;

        StringBuilder res = new StringBuilder();
        int prevDigit = 0;
        for (int i = a1.length() - 1; i >= 0; i--) {
            int digit1 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            int digit2 = Integer.parseInt(String.valueOf(b1.charAt(i)));
            int sum = digit1 + digit2 + prevDigit;
            if (sum > 9) {
                prevDigit = 1;
                sum = sum % 10;
            } else {
                prevDigit = 0;
            }
            res.insert(0, sum);
        }
        if (prevDigit != 0) {
            res.insert(0, prevDigit);
        }

        //display result
        System.out.println(res.toString());
    }
}
