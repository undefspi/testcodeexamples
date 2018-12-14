package factoryexample;

/**
 * Created by chris on 10/12/2018.
 */
public class app {
    public static void main(String[] args) {

        PersistedFile file = new PersistedFile("text.txt", "Hello, world!", new Sha256Encryptor());
    }
}
