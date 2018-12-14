package work.debatcher;

import work.factory.FeedManager;

/**
 * Created by chris on 11/12/2018.
 */
public class Debatcher {
    public static void main(String[] args) {
        FeedManager feedManager = new FeedManager("special") ;
        feedManager.processFeed();
    }
}
