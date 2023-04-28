package week12.jumper.state;

import week12.jumper.Player;

public class Jumping implements PlayerState{

    private final Player player;

    public Jumping(Player player, double jumpVelocity) {
        this.player = player;
        this.player.setVelocity(jumpVelocity);
    }

    @Override
    public double height() {
        return this.player.getHeight();
    }

    @Override
    public double verticalVelocity() {
        return this.player.getVelocity();
    }

    @Override
    public void leftDown() {

    }

    @Override
    public void leftUp() {

    }

    @Override
    public void rightDown() {

    }

    @Override
    public void rightUp() {

    }

    @Override
    public void jump() {
        this.player.stateTransition(new JumpingAfterDoubleJump(this.player, 5.0));
    }

    @Override
    public void update(double deltaTime) {
        double gravitationalConstant = 10.0;
        this.player.setHeight(this.player.getHeight() + this.player.getVelocity() * deltaTime);
        this.player.setVelocity(this.player.getVelocity() - deltaTime * gravitationalConstant);

        if(this.player.getHeight() < 0.001){
            this.player.setHeight(0.0);
            this.player.setVelocity(0.0);
            this.player.stateTransition(new Standing(this.player));
        }
    }

}
