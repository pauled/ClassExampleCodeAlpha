package week12.tv.state;

import week12.tv.TV;

public class On implements TVState{

    private final TV tv;

    public On(TV tv){
        this.tv = tv;

        Off off = new Off(this.tv);
        System.out.println(off.tv);
    }

    @Override
    public void volumeUpPressed() {
        int maxVolume = 10;
        int proposedVolume = this.tv.getVolume() + 1;
        int actualNewVolume = Math.min(proposedVolume, maxVolume);
        this.tv.setVolume(actualNewVolume);
    }

    @Override
    public void volumeDownPressed() {
        int minVolume = 0;
        int proposedVolume = this.tv.getVolume() - 1;
        int actualNewVolume = Math.max(proposedVolume, minVolume);
        this.tv.setVolume(actualNewVolume);
    }

    @Override
    public void mutePressed() {
        this.tv.stateTransition(new Muted(this.tv));
    }

    @Override
    public void powerPressed() {
        this.tv.stateTransition(new Off(this.tv));
    }

    @Override
    public int currentVolume() {
        return this.tv.getVolume();
    }
}
