package week2;

import org.junit.Test;
import week2.FirstRecursion;

import static org.junit.Assert.assertTrue;

public class FirstRecursionTests {
    @Test
    public void testAdd() {
        int sum = FirstRecursion.add(4, 3);
        assertTrue("expected 7 and got: " + sum, 7 == sum);
        sum = FirstRecursion.add(4, -3);
        assertTrue("expected 1 and got: " + sum, 7 == sum);
    }
}
