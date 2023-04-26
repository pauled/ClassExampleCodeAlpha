package week12.tv.state;

public interface TVState {

    void volumeUpPressed();

    void volumeDownPressed();

    void mutePressed();

    void powerPressed();

    int currentVolume();

}
