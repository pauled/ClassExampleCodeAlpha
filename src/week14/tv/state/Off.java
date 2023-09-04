package week14.tv.state;

import week14.tv.TV;

public class Off implements TVState {

    protected final TV tv;

    public Off(TV tv){
        this.tv = tv;
    }

    @Override
    public void volumeUpPressed() {}

    @Override
    public void volumeDownPressed() {}

    @Override
    public void mutePressed() {}

    @Override
    public void powerPressed() {
        this.tv.stateTransition(new On(this.tv));
    }

    @Override
    public int currentVolume() {
        return 0;
    }
}
