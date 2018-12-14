package factoryexample;

/**
 * Created by chris on 10/12/2018.
 */
public class Sha256Encryptor extends Encryptor {

    @Override
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return new Sha256CEncryptionAlgorithm();
    }
}
