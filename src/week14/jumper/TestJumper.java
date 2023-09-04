package week14.jumper;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJumper {

    public void checkPlayer(Player player, double expectedHeight, double expectedVelocity){
        double epsilon = 0.0001;
        assertEquals(expectedHeight, player.height(), epsilon);
        assertEquals(expectedVelocity, player.verticalVelocity(), epsilon);
    }

    @Test
    public void jumpAround() {
        Player player = new Player();

        checkPlayer(player, 0.0, 0.0);

        player.jump();
        checkPlayer(player, 0.0, 5.0);

        player.update(1.0);
        checkPlayer(player, 5.0, -5.0);

        player.update(1.0);
        checkPlayer(player, 0.0, 0.0);

        player.leftDown();
        player.jump();
        checkPlayer(player, 0.0, 10.0);

        player.update(1.0);
        checkPlayer(player, 10.0, 0.0);

        player.update(1.0);
        checkPlayer(player, 10.0, -10.0);

        player.update(1.0);
        checkPlayer(player, 0.0, 0.0);

        player.update(10.0);
        checkPlayer(player, 0.0, 0.0);

        player.jump();
        checkPlayer(player, 0.0, 5.0);

        player.update(1.0);
        checkPlayer(player, 5.0, -5.0);

        player.jump();
        checkPlayer(player, 5.0, 5.0);

        player.update(1.0);
        checkPlayer(player, 10.0, -5.0);

        player.jump();
        player.jump();
        player.jump();
        player.jump();
        player.jump();
        checkPlayer(player, 10.0, -5.0);

        player.update(10.0);
        checkPlayer(player, 0.0, 0.0);

        player.jump();
        checkPlayer(player, 0.0, 5.0);

        player.update(1.0);
        checkPlayer(player, 5.0, -5.0);

        player.jump();
        checkPlayer(player, 5.0, 5.0);

        player.update(1.0);
        checkPlayer(player, 10.0, -5.0);
    }

}
