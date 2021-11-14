package mate_jv_core;

public class IntToBnr {
    public static String convertIntToBnrStr(int number) {
        StringBuilder sb = new StringBuilder();
        if (number == 0) {
            sb.append("0");
        }
        while (number > 0) {
            String s = number % 2 == 0 ? "0" : "1";
            sb.append(s);
            number /= 2;
        }
        return String.valueOf(sb.reverse());
    }

    public static void main(String[] args) {
        System.out.printf("%s\n", convertIntToBnrStr(0));
        System.out.printf("%s\n", convertIntToBnrStr(1));
        System.out.printf("%s\n", convertIntToBnrStr(2));
        System.out.printf("%s\n", convertIntToBnrStr(3));
        System.out.printf("%s\n", convertIntToBnrStr(4));
        System.out.printf("%s\n", convertIntToBnrStr(5));
    }
}
