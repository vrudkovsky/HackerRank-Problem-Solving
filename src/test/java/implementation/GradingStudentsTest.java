package implementation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {

    @Test
    void gradingStudents() {

        List<Integer> a = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        a.add(73);
        a.add(67);
        a.add(38);
        a.add(33);
        expected.add(75);
        expected.add(67);
        expected.add(40);
        expected.add(33);
        List<Integer> actual = GradingStudents.gradingStudents(a);
        assertArrayEquals(expected.toArray(),actual.toArray());
    }
}