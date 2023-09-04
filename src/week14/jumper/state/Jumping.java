package week14.jumper.state;

import week14.jumper.Player;

public class Jumping implements PlayerState {

    private final Player player;

    public Jumping(Player player, double initialVelocity) {
        this.player = player;
        this.player.setVelocity(initialVelocity);
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
    public void update(double elapsedSeconds) {
        double gravitationalConstant = 10.0;
        this.player.setHeight(this.player.getHeight() + this.player.getVelocity() * elapsedSeconds);
        this.player.setVelocity(this.player.getVelocity() - gravitationalConstant * elapsedSeconds);

        if(this.player.getHeight() < 0.0001){
            this.player.setHeight(0.0);
            this.player.setVelocity(0.0);
            this.player.stateTransition(new Standing(this.player));
        }
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
        this.player.stateTransition(new JumpongAfterDoubleJump(this.player, 5.0));
    }
}
