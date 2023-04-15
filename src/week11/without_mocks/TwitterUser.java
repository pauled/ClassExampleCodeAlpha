package week11.without_mocks;

import java.util.Map;

import static java.util.Map.entry;

public class TwitterUser {

    private final TwitterAPI twitterAPI;
    private String mood = "default";

    private static final Map<String, String> tweetsByMood = Map.ofEntries(
            entry("happy", "So glad to be in lecture today! :)"),
            entry("sad", "I wish I Jesse's lecture's lasted longer.. :("),
            entry("angry", "why is CSE so hard!?"),
            entry("joy", "\"score for this problem 1.0\" <-- Yeah baby!"),
            entry("relief", "Passed interview and quiz.. not going to lab this week!"),
            entry("anticipation", "4 more weeks..."),
            entry("default", "I have no emotions")
    );
    private static final String defaultTweet = "I don't even know how to feel..";

    public TwitterUser() {
        this.twitterAPI = new TwitterAPI();
    }

    public void setMood(String newMood) {
        this.mood = newMood;
    }

    public void tweetMood() {
        String tweet = TwitterUser.tweetsByMood.getOrDefault(this.mood, TwitterUser.defaultTweet);
        twitterAPI.sendTweet(tweet);
    }

    public static void main(String[] args) {
        TwitterUser thing = new TwitterUser();
        thing.setMood("anticipation");
        thing.tweetMood();
    }

}
