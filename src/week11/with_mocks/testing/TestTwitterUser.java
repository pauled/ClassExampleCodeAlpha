package week11.with_mocks.testing;

import org.junit.Test;
import week11.with_mocks.TwitterUser;

import java.util.Map;

import static java.util.Map.entry;
import static org.junit.Assert.assertEquals;

public class TestTwitterUser {

    @Test
    public void testTwitterUserMoods(){
        MockTwitter mock = new MockTwitter();
        TwitterUser user = new TwitterUser(mock);

        int expectedTimesCalled = 1;

        user.tweetMood();
        assertEquals(expectedTimesCalled, mock.getTweetsSent());
        assertEquals("I have no emotions", mock.getMostRecentParameter());

        user.setMood("happy");
        user.tweetMood();
        assertEquals(2, mock.getTweetsSent());
        assertEquals("So glad to be in lecture today! :)", mock.getMostRecentParameter());

        user.setMood("sad");
        user.tweetMood();
        assertEquals(3, mock.getTweetsSent());
        assertEquals("I wish I Jesse's lecture's lasted longer.. :(", mock.getMostRecentParameter());

        user.setMood("I have complex emotions");
        user.tweetMood();
        assertEquals(4, mock.getTweetsSent());
        assertEquals("I don't even know how to feel..", mock.getMostRecentParameter());
    }

}
