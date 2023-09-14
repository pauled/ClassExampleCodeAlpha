package week3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusMinusTests {

    @Test
    public void testPlusMinus() {
        String pm = PlusMinus.plusMinus(95);
        assertEquals("95 There should be no +-, got: " + pm, "", pm);

        pm = PlusMinus.plusMinus(78);
        assertEquals("78 It should be +, got: " + pm, "+", pm);

        pm = PlusMinus.plusMinus(51);
        assertEquals("51 It should be -, got: " + pm, "-", pm);

        pm = PlusMinus.plusMinus(100);
        assertEquals("100 It should be +, got: " + pm, "+", pm);
    }
}
