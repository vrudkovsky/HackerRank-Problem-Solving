package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void simpleArraySum() {
        int n = 6;
        int[] ar = {1, 2, 3, 4, 10, 11};
        int expected = 31;
        int actual = SimpleArraySum.simpleArraySum(ar);
        assertEquals(expected,actual);
    }
}