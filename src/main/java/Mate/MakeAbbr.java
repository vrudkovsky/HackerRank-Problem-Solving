package Mate;

public class MakeAbbr {
    public static String makeAbbr(String fullName) {
        // write your code here
        String string = fullName.toUpperCase();
        String[] as = string.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String s : as) {
            sb.append(s.charAt(0));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "central processing unit";
        System.out.println(makeAbbr(s));
    }
}
