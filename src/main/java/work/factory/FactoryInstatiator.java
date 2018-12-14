package work.factory;

/**
 * Created by chris on 13/12/2018.
 */
public class FactoryInstatiator {

    public FeedProcessor special(){
        return new SpecialProcessor();
    }

    public FeedProcessor other(){
        return new OtherFeedProcessor();
    }
}

