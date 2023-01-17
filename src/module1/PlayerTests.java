package module1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class PlayerTests {
    @Test
    public void testPlayer(){
        Player p1=new Player(4);
        Player p2=new Player(4);
        assertTrue("These should be equal ",p1==p2);
        assertTrue("These should be equal ",p1.getHP()==p2.getHP() && p1.getMaxHP()==p2.getMaxHP());
    }
}
