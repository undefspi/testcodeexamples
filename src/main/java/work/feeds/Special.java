package work.feeds;

import work.debatcher.FeedSource;

/**
 * Created by chris on 11/12/2018.
 */
public class Special implements Feed {
    @Override
    public void process(FeedSource source) {
        System.out.println("I am processing Special " + source.toString());
    }
}
