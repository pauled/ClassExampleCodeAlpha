package week3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PlusMinusTests {
    @Test
    public void testDouble() {
        double bad = 0;
        int size = 10;
        for (int x = 0; x < size; x++) {
            bad += .1;
        }
        assertTrue("If there were no issue this would not fail but expected " + (.1 * size) + " but got: " + bad, bad == (.1 * size));
    }

    @Test
    public void testPlusMinus() {
        String pm = PlusMinus.plusMinus(95);
        assertTrue("95 There should be no +-, got: " + pm, pm.equals(""));
        pm = PlusMinus.plusMinus(78);
        assertTrue("78 It should be +, got: " + pm, pm.equals("+"));
        pm = PlusMinus.plusMinus(51);
        assertTrue("51 It should be -, got: " + pm, pm.equals("-"));
        pm = PlusMinus.plusMinus(100);
        assertTrue("100 It should be +, got: " + pm, pm.equals("+"));
    }
}
