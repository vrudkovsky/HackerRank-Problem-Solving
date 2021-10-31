package Mate;

public class MiddleCharacter {
    public static String getMiddleCharacter(String s) {
        char[] cs = s.toCharArray();
        int mid = cs.length / 2;
        StringBuilder sb = new StringBuilder();
        if (s.equals("") || s == null) return "";
        if (cs.length % 2 == 0) {
            sb.append(cs[mid - 1]);
            sb.append(cs[mid]);
            return String.valueOf(sb);
        } else {
            return String.valueOf(cs[mid]);
         }
    }

    public static void main(String[] args) {
        System.out.println(getMiddleCharacter("kangaroo"));
    }
}
