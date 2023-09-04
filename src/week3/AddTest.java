package week3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AddTest {

    @Test
    public void testAddFive() {
        assertTrue(Adder.addFive(2) == 7);
        assertTrue(Adder.addFive(5) == 10);
        assertTrue(Adder.addFive(1) == 6);
        assertTrue(Adder.addFive(10) == 15);
        assertTrue(Adder.addFive(100) == 105);
    }

    @Test
    public void testAddFiveWithNegatives() {
        assertTrue(Adder.addFive(-1) == 4);
        assertTrue(Adder.addFive(-5) == 0);
        assertTrue(Adder.addFive(-10) == -5);
        assertTrue(Adder.addFive(-51) == -46);
        assertTrue(Adder.addFive(-100) == -95);
    }

    @Test
    public void testAddFiveEdgeCase() {
        assertTrue(Adder.addFive(0) == 5);
    }

}
