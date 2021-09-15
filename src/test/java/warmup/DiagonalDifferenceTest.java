package warmup;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {

    @Test
    void resultv6() {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        List<Integer> a3 = new ArrayList<>();
        int[][] m = {
                {11, 2 , 4},
                {4, 5 , 6},
                {10, 8 , -12}
        };

        a1.add(11);
        a1.add(2);
        a1.add(4);

        a2.add(4);
        a2.add(5);
        a2.add(6);

        a3.add(10);
        a3.add(8);
        a3.add(-12);

        arr.add(a1);
        arr.add(a2);
        arr.add(a3);

        int expected = 15;
        int actual = DiagonalDifference.resultv6(arr);
        assertEquals(expected, actual);
    }
}