package work.feeds;

/**
 * Created by chris on 11/12/2018.
 */
public class OtherFeed implements Feed {
    @Override
    public void process(FeedSource source) {
        System.out.println("I am processing the other feed");
    }
}
