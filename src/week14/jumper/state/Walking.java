package week14.jumper.state;

import week14.jumper.Player;

public class Walking implements PlayerState {

    private final Player player;

    public Walking(Player player) {
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

    }

    @Override
    public void leftUp() {
        this.player.stateTransition(new Standing(this.player));
    }

    @Override
    public void rightDown() {

    }

    @Override
    public void rightUp() {
        this.player.stateTransition(new Standing(this.player));
    }

    @Override
    public void jump() {
        this.player.stateTransition(new Jumping(this.player, 10.0));
    }
}
