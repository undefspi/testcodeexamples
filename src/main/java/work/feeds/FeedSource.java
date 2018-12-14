package work.feeds;

/**
 * Created by chris on 11/12/2018.
 */
public class FeedSource {

    private String sourcetype;

    public FeedSource(String type){
        this.sourcetype = type;
    }

    @Override
    public String toString() {
        return this.sourcetype;
    }
}
