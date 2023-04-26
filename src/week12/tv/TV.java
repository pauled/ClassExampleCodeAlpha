package week12.tv;

import week12.tv.state.Off;
import week12.tv.state.TVState;

public class TV {

    private TVState state = new Off(this);
    private int volume = 5;

    public void stateTransition(TVState newState){
        this.state = newState;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void volumeUpPressed(){
        this.state.volumeUpPressed();
    }
    public void volumeDownPressed(){
        this.state.volumeDownPressed();
    }
    public void mutePressed(){
        this.state.mutePressed();
    }
    public void powerPressed(){
        this.state.powerPressed();
    }
    public int currentVolume(){
        return this.state.currentVolume();
    }

    // initial -- Off
    // On
    // Mute
    // ...

    /*
    TV Spec Sheet
    -TV is initially off when created
    -Initial volume is 5
    -When the TV is off:
     --Volume up/down and mute buttons do nothing
     --Current volume is 0
    -The power button turns the TV on/off
    -Volume up button increases volume by 1 up to a maximum volume of 10
    -Volume down button decreases volume by 1 down to minimum volume of 0
    -Pressing the mute button mutes/unmutes the TV
    -When the TV is muted:
     --Current volume is 0
     --Pressing the mute, volume up, or volume down buttons will unmute the TV and restore the volume to the
       pre-mute volume (Do not in/decrease the volume)
    -When turning the TV back on, the volume should return to its value when the TV was last on
     --If the TV was turned off while muted, when it is turned back on it should still be muted
     */

}
