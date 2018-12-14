package work.factory;

import work.feeds.FeedSource;
import work.feeds.Feed;

/**
 * Created by chris on 11/12/2018.
 */
public abstract class FeedProcessor {

    public void startProcessing(FeedSource source){
        Feed feed = getFeed();
        feed.process(source);
    }

    public abstract Feed getFeed();

}
