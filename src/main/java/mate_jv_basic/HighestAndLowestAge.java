package mate_jv_basic;

import java.util.Arrays;

public class HighestAndLowestAge {

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static int[] getHighestAndLowestAge(int[] ages) {
        // write your code here
        int[] res = new int[2];
        int l = ages.length;
        int[] temparr = ages;
        sort(temparr);
        res[0] = temparr[l - 1];
        res[1] = temparr[0];
        return res;
    }

    public static void main(String[] args) {
        int[] hla1 = getHighestAndLowestAge(new int[]{10, 40, 36});//-> [40, 10]
        int[] hla2 = getHighestAndLowestAge(new int[]{10, 12, 14, 19, 21, 49, 56});//-> [97, 4]
        int[] hla3 = getHighestAndLowestAge(new int[]{35});//-> [35, 35]
        // 35 - це одночасно найбільший та найменший вік
        System.out.println(Arrays.toString(hla1));
        System.out.println(Arrays.toString(hla2));
        System.out.println(Arrays.toString(hla3));

    }
}
