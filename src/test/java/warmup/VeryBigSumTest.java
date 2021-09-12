package warmup;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VeryBigSumTest {

    @Test
    void aVeryBigSum() {
        List<Long> ar = new ArrayList<>();
        ar.add(1000000001l);
        ar.add(1000000002l);
        ar.add(1000000003l);
        ar.add(1000000004l);
        ar.add(1000000005l);
        long expected = 5000000015l;
        long actual = VeryBigSum.aVeryBigSum(ar);
        assertEquals(expected,actual);
    }
}