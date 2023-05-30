package week12.jumper.state;

public interface PlayerState {

    double height();

    double verticalVelocity();

    void update(double elapsedSeconds);

    void leftDown();

    void leftUp();

    void rightDown();

    void rightUp();

    void jump();
}
