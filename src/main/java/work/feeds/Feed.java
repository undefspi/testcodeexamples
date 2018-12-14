package work.feeds;

import work.debatcher.FeedSource;

/**
 * Created by chris on 11/12/2018.
 */

//synominous to encyrptionalgorithm
public interface Feed {

    public void process(FeedSource source);
}
