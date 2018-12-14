package work.feeds;

import work.debatcher.FeedSource;
import work.factory.FactoryInstatiator;
import work.factory.FeedProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chris on 11/12/2018.
 */
public class FeedManager {
    private FeedSource source;
    private FeedProcessor feedProcessor;
    private String feedParam;

    public FeedManager(String feedParam){
        this.source = new FeedSource("special");
        this.feedParam = feedParam;
        this.feedProcessor = getInstance(feedParam);
    }

    public void processFeed(){
        this.feedProcessor.startProcessing(source);
    }

    public FeedProcessor getInstance(String feedParam){
        try{
            return getConcreateInstance(FactoryInstatiator.class, feedParam);
        }catch(InstantiationException | IllegalAccessException | IllegalArgumentException |
                InvocationTargetException | NoSuchMethodException ex){
            System.out.println(FeedManager.class.getName() + ex.getStackTrace());
        }
        throw new RuntimeException("Could not determine instance based on data");
    }

    private FeedProcessor getConcreateInstance(Class<FactoryInstatiator> factoryInstatiator, String feedParam) throws InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException{
        Class[] methodParameterTypes=null;
        Object instance = factoryInstatiator.newInstance();
        Method method = factoryInstatiator.getDeclaredMethod(feedParam, methodParameterTypes);
        return (FeedProcessor) method.invoke(instance);
    }
}
