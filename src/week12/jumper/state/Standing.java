package week12.jumper.state;

import week12.jumper.Player;

public class Standing implements PlayerState {

    private final Player player;

    public Standing(Player player) {
        this.player = player;
    }

    @Override
    public double height() {
        return 0.0;
    }

    @Override
    public double verticalVelocity() {
        return 0.0;
    }

    @Override
    public void update(double elapsedSeconds) {

    }

    @Override
    public void leftDown() {
        this.player.stateTransition(new Walking(this.player));
    }

    @Override
    public void leftUp() {

    }

    @Override
    public void rightDown() {
        this.player.stateTransition(new Walking(this.player));
    }

    @Override
    public void rightUp() {

    }

    @Override
    public void jump() {
        this.player.stateTransition(new Jumping(this.player, 5.0));
    }
}
