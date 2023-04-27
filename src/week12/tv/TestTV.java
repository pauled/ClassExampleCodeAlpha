package week12.tv;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTV {

    @Test
    public void playWithTheRemote() {

        TV tv = new TV();

        assertEquals(0, tv.currentVolume());

        tv.volumeUpPressed();

        assertEquals(0, tv.currentVolume());

        tv.mutePressed();
        tv.volumeDownPressed();
        tv.volumeDownPressed();

        assertEquals(0, tv.currentVolume());

        tv.powerPressed();

        assertEquals(5, tv.currentVolume());

        tv.volumeDownPressed();
        assertEquals(4, tv.currentVolume());
        tv.volumeUpPressed();
        assertEquals(5, tv.currentVolume());

        tv.mutePressed();

        assertEquals(0, tv.currentVolume());

        tv.volumeUpPressed();
        assertEquals(5, tv.currentVolume());

        tv.volumeUpPressed();
        assertEquals(6, tv.currentVolume());

        tv.volumeUpPressed();
        assertEquals(7, tv.currentVolume());

        tv.mutePressed();
        assertEquals(0, tv.currentVolume());
        tv.mutePressed();
        assertEquals(7, tv.currentVolume());

        tv.mutePressed();
        assertEquals(0, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(7, tv.currentVolume());

        tv.mutePressed();
        tv.powerPressed();
        assertEquals(0, tv.currentVolume());

        tv.powerPressed();
        assertEquals(0, tv.currentVolume());

        tv.volumeUpPressed();
        assertEquals(7, tv.currentVolume());

        tv.volumeUpPressed();
        assertEquals(8, tv.currentVolume());

        tv.volumeUpPressed();
        assertEquals(9, tv.currentVolume());
        tv.volumeUpPressed();
        assertEquals(10, tv.currentVolume());
        tv.volumeUpPressed();
        assertEquals(10, tv.currentVolume());


        tv.volumeDownPressed();
        assertEquals(9, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(8, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(7, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(6, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(5, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(4, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(3, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(2, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(1, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(0, tv.currentVolume());
        tv.volumeDownPressed();
        assertEquals(0, tv.currentVolume());
    }

}
