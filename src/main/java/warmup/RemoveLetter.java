package warmup;

import java.util.Arrays;
import java.util.Locale;

public class RemoveLetter {

    public static char[] removeLetter(String s) {
        return (s == null)?
                new char[0] :
                s.toLowerCase().replaceAll("r", "!").toCharArray();
    }

    public static void main(String[] args) {
        String input1 = "Remove Letters";
        String input2 = "";
        char[] chars1 = removeLetter(input1);
        System.out.printf("%s\n", Arrays.toString(chars1));
        char[] chars2 = removeLetter(input2);
        System.out.printf("%s\n", Arrays.toString(chars2));
    }
}
