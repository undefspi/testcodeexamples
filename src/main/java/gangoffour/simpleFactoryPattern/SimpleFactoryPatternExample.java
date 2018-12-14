package gangoffour.simpleFactoryPattern;

/**
 * Created by chris on 10/12/2018.
 */
public class SimpleFactoryPatternExample {

    public static void main(String[] args) {
        System.out.println("*** Simple Factory Pattern Demo***\n");
        Animal preferredType=null;
        SimpleFactory simpleFactory = new SimpleFactory();
        // The code that will vary based on users preference.
        preferredType = simpleFactory.createAnimal();
        //The codes that do not change frequently.
        //These animals can speak and prefer to do some specific actions.
        preferredType.speak();
        preferredType.preferredAction();
    }
}
