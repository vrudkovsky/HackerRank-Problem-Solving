package warmup;

public class ArrayeElementStatistic {
    public static void main(String[] args) {
        //read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        //processing
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == element) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                int number = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (element == array[j]) {
                        number++;
                    }
                }
                unique[count] = element;
                counts[count] = number;
                count++;
            }
        }

        //display results
        for (int i = 0; i < count; i++) {
            System.out.printf("%d = %.2f%%\n", unique[i], ((double) counts[i] * 100 / array.length));
        }

    }
}
