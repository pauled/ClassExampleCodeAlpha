package week12.jumper;

import week12.jumper.state.PlayerState;
import week12.jumper.state.Standing;

public class Player {

    private PlayerState state = new Standing(this);
    private double height = 0.0;
    private double velocity = 0.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void stateTransition(PlayerState newState){
        this.state = newState;
    }

    public double height() {
        return this.state.height();
    }

    public double verticalVelocity() {
        return this.state.verticalVelocity();
    }

    public void update(double elapsedSeconds) {
        this.state.update(elapsedSeconds);
    }

    public void leftDown() {
        this.state.leftDown();
    }

    public void leftUp() {
        this.state.leftUp();
    }

    public void rightDown() {
        this.state.rightDown();
    }

    public void rightUp() {
        this.state.rightUp();
    }

    public void jump() {
        this.state.jump();
    }


    /*
    Each player should
    -Start with a height of 0
    -Walk left and right when keys are pressed
    -Stop walking when left or right are released
    -Jump when jump is pressed
    --Jumping will set their vertical velocity to 5 units/second
    -While in the air, gravity of 10 units/second^2 will be applied linearly when updated
    --Height will be updated before applying gravity (to keep the math simple)
    -Jump higher if walking instead of standing still (10 instead of 5 velocity)
    -Stop falling when their height is 0
    -When a player lands, they are standing (And assume left and right are not pressed)

    -Be able to double Jump one time while in the air
    --Double jump velocity is 5
     */


}
