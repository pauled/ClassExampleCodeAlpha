package week12.jumper.state;

import week12.jumper.Player;

public class JumpingAfterDoubleJump extends Jumping {

    public JumpingAfterDoubleJump(Player player, double jumpVelocity) {
        super(player, jumpVelocity);
    }

    @Override
    public void jump(){
        // nothing
    }
}
