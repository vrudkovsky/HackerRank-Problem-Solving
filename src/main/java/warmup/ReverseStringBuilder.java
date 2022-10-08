package warmup;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        //read source data
        String s = "hello world";

        //processing
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        //desplay result
        System.out.println(sb.toString());
    }
}
