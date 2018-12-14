package factoryexample;

/**
 * Created by chris on 10/12/2018
 * This is the thing that gets created - this is the product and it can be lots of
 * different types
 */
public interface EncryptionAlgorithm {

    public String encrypt(String plaintext);

}
