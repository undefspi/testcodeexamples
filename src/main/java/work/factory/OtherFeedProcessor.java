package work.factory;

import work.feeds.Feed;
import work.feeds.OtherFeed;

/**
 * Created by chris on 11/12/2018.
 */
public class OtherFeedProcessor extends FeedProcessor {

    @Override
    public Feed getFeed() {
        return new OtherFeed();
    }
}
