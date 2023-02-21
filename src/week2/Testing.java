package week2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Testing {

    private final double EPSILON = 0.001;

    public void compareDoubles(double d1, double d2) {
        //assertTrue(d1 + " and " + d2 + " are not equal", d1 == d2);
        assertTrue(d1 + " and " + d2 + " are not within " + EPSILON, Math.abs(d1 - d2) < EPSILON);
    }

    @Test
    public void testDoublesGood() {
        compareDoubles(1.0, 1.0);
        compareDoubles(0.3, 0.1 * 3.0);
    }

    @Test
    public void testDoublesBad() {
        // Never use == to compare doubles
        System.out.println(0.1 * 3.0);
        assertTrue(0.3 == 0.1 * 3.0);
    }

    @Test
    public void testStringsGoodExample() {
        String str1 = "ab";
        String str2 = "ab";
        assertTrue("strings equal?", str1.equals(str2));
    }

    @Test
    public void testStringsBadExample() {
        String str1 = "ab ".strip();
        String str2 = "ab ".strip();
        // Never use == to compare Strings
        assertTrue("strings equal?", str1 == str2);
    }

}
