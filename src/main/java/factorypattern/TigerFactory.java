package factorypattern;

/**
 * Created by chris on 10/12/2018.
 */
public class TigerFactory extends AnimalFactory {
    //Creating a Tiger


    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
