package factoryexample;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by chris on 10/12/2018.
 *
 * This is the creator interface - it is not concreate but the creator thing is derived from this
 * and it has all the methods
 */
public abstract class Encryptor {

    //method that just writes to disk
    public void writeToDisk(String plaintext, String filename) {
        EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
        String cyphertext = encryptionAlgorithm.encrypt(plaintext);
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            outputStream.write(cyphertext.getBytes());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    // method that creates the product
    public abstract EncryptionAlgorithm getEncryptionAlgorithm();
}
