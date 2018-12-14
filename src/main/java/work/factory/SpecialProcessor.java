package work.factory;

import work.feeds.Feed;
import work.feeds.Special;

/**
 * Created by chris on 11/12/2018.
 */
public class SpecialProcessor extends FeedProcessor {

    @Override
    public Feed getFeed() {
        return new Special();
    }
}
