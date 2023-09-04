package week14.tv.state;

import week14.tv.TV;

public class OffMuted extends Off {

    public OffMuted(TV tv) {
        super(tv);
    }

    @Override
    public void powerPressed() {
        this.tv.stateTransition(new Muted(this.tv));
    }

}
