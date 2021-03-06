package warmup;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompareTripletsTest {

    @Test
    void comparev1() {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        arr1.add(17);
        arr1.add(28);
        arr1.add(30);
        arr2.add(99);
        arr2.add(16);
        arr2.add(8);
        expected.add(2);
        expected.add(1);
        List<Integer> actual = CompareTriplets.comparev1(arr1, arr2);
        assertArrayEquals(expected.toArray(),actual.toArray());
    }

    @Test
    void comparev2() {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        arr1.add(17);
        arr1.add(28);
        arr1.add(30);
        arr2.add(99);
        arr2.add(16);
        arr2.add(8);
        expected.add(2);
        expected.add(1);
        List<Integer> actual = CompareTriplets.comparev1(arr1, arr2);
        assertArrayEquals(expected.toArray(),actual.toArray());
    }
}
