package practice;

import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] ar = a.toLowerCase().toCharArray();
        char[] br = b.toLowerCase().toCharArray();
        if (a.length() != b.length()) return false;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != br[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

