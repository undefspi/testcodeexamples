package work.feeds;

/**
 *
 * Created by chris on 11/12/2018.
 */
public class Special implements Feed {
    @Override
    public void process(FeedSource source) {
        System.out.printf("I am processing Special %s%n", source.toString());
    }
}
