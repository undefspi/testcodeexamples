package factorypattern;

/**
 * Created by chris on 10/12/2018.
 */
public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
