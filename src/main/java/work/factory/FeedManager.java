package work.factory;

import org.apache.commons.lang.Validate;
import work.feeds.FeedSource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.MessageFormat;

/**
 *
 * Created by chris on 11/12/2018.
 */
public class FeedManager {
    private final FeedSource source = new FeedSource("special");
    private final FeedProcessor feedProcessor;
    private final String feedParam; // Required

    public FeedManager(String feedParam) throws IllegalArgumentException{
        Validate.notNull(feedParam, "Feed Manager Cannot be supplied with Null");
        this.feedParam = feedParam;
        this.feedProcessor = getInstance();
    }

    public void processFeed(){
        this.feedProcessor.startProcessing(source);
    }


    private FeedProcessor getInstance(){
        try{
            return getConcreateInstance(FactoryInstatiator.class, this.feedParam);
        }catch(InstantiationException | IllegalAccessException | IllegalArgumentException |
                InvocationTargetException | NoSuchMethodException ex){
            System.out.println(MessageFormat.format("{0}{1}", FeedManager.class.getName(), ex.getStackTrace()));
        }
        throw new RuntimeException("Could not determine instance based on data");
    }

    private FeedProcessor getConcreateInstance(Class<FactoryInstatiator> factoryInstatiator, String feedParam) throws InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException{
        Object instance = factoryInstatiator.newInstance();
        Method method = factoryInstatiator.getDeclaredMethod(feedParam);
        return (FeedProcessor) method.invoke(instance);
    }
}
