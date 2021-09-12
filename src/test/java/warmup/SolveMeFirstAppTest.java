package warmup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveMeFirstAppTest {

    @Test
    @DisplayName("If put 2+3, test returns 5")
    public void solveMeFirst() {
        int a = 2;
        int b = 3;
        int expected = 5;
        int actual = SolveMeFirstApp.solveMeFirst(a, b);
        assertEquals(expected, actual);
    }
}