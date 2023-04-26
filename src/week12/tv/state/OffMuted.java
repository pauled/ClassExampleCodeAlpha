package week12.tv.state;

import week12.tv.TV;

public class OffMuted extends Off {

    public OffMuted(TV tv) {
        super(tv);
    }

    @Override
    public void powerPressed() {
        this.tv.stateTransition(new Muted(this.tv));
    }

}
