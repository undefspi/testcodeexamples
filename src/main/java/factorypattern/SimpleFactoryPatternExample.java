package factorypattern;

/**
 * Created by chris on 10/12/2018.
 */
public class SimpleFactoryPatternExample {

    public static void main(String[] args) {
        System.out.println("***Factory Pattern Demo***\n");
        // Creating a Tiger Factory
        AnimalFactory tigerFactory =new TigerFactory();
        // Creating a tiger using the Factory Method
        Animal aTiger = tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();
        // Creating a DogFactory
        AnimalFactory dogFactory = new DogFactory();
        // Creating a dog using the Factory Method
        Animal aDog = dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();
    }
}
