package work.debatcher;

import work.feeds.FeedManager;

/**
 * Created by chris on 11/12/2018.
 */
public class Debatcher {
    public static void main(String[] args) {
       // FeedSource ovsource = new FeedSource("special");
       // FeedSource othersource = new FeedSource("other");
        FeedManager feedManager = new FeedManager("special" );
        feedManager.processFeed();
    }
}
