package warmup;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        //read source data
        int[] array = {-5, -2, 3, 8, 5};

        //processing
        int indexOfMinElement = 0;
        int minValue = array[0];
        int indexOfMaxElement = 0;
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (current < minValue) {
                minValue = current;
                indexOfMinElement = i;
            }
            if (current > maxValue) {
                maxValue = current;
                indexOfMaxElement = i;
            }


        }
        int temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMinElement];
        array[indexOfMinElement] = temp;

        //display result
        System.out.println(Arrays.toString(array));
    }
}
