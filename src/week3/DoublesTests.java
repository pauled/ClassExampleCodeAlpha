package week3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DoublesTests {

    private final double EPSILON = 0.001;

    public void compareDoubles(double d1, double d2) {
        assertTrue(Math.abs(d1 - d2) < EPSILON);
    }

    @Test
    public void testDoublesBad() {
        // Never use == to compare doubles
        double y = Doubles.timesThree(0.1);
        System.out.println(y);
        assertTrue(y == 0.3);
    }

    @Test
    public void testDoublesGood() {
        double y = Doubles.timesThree(0.1);
        System.out.println(y);
        compareDoubles(0.3, y);
    }

    @Test
    public void testDoublesBetter() {
        double y = Doubles.timesThree(0.1);
        System.out.println(y);
        assertEquals(0.3, y, 0.001);
    }


}
