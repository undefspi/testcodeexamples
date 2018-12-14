package factorypattern;

/**
 * Created by chris on 10/12/2018.
 */
public class Tiger implements Animal {

    @Override
    public void speak() {
        System.out.println("Tiger says: Halum.");

    }

    @Override
    public void preferredAction() {
        System.out.println("Tigers prefer hunting...");
    }
}
