package week4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class PlayerTests {
    @Test
    public void testPlayer() {
        Player p1 = new Player("Goku", 150);
        Player p2 = new Player("Goku", 150);
        // Don't use == to compare objects
        assertTrue("These should be equal ", p1 == p2);
        assertTrue("These should be equal ", p1.getHP() == p2.getHP() && p1.getMaxHP() == p2.getMaxHP());
    }
}
