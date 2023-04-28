package week12.jumper.state;

public interface PlayerState {
    double height();

    double verticalVelocity();

    void leftDown();

    void leftUp();

    void rightDown();

    void rightUp();

    void jump();

    void update(double deltaTime);

}
