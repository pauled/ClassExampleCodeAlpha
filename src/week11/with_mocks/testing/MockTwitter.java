package week11.with_mocks.testing;

import week11.with_mocks.TwitterAPI;

public class MockTwitter implements TwitterAPI {

    // Make sure your mock is in your testing package

    private int tweetsSent = 0;
    private String mostRecentParameter = "";

    public MockTwitter(){}

    @Override
    public void sendTweet(String tweet) {
        this.tweetsSent++;
        this.mostRecentParameter = tweet;
    }

    public int getTweetsSent() {
        return tweetsSent;
    }

    public String getMostRecentParameter() {
        return mostRecentParameter;
    }

}
