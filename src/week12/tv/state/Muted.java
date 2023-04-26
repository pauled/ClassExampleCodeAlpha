package week12.tv.state;

import week12.tv.TV;

public class Muted implements TVState{

    private final TV tv;

    public Muted(TV tv){
        this.tv = tv;
    }

    @Override
    public void volumeUpPressed() {
        this.tv.stateTransition(new On(this.tv));
    }

    @Override
    public void volumeDownPressed() {
        this.tv.stateTransition(new On(this.tv));
    }

    @Override
    public void mutePressed() {
        this.tv.stateTransition(new On(this.tv));
    }

    @Override
    public void powerPressed() {
        this.tv.stateTransition(new OffMuted(this.tv));
    }

    @Override
    public int currentVolume() {
        return 0;
    }
}
