package factoryexample;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by chris on 10/12/2018.
 */
public class Sha256CEncryptionAlgorithm implements EncryptionAlgorithm {

    @Override
    public String encrypt(String plaintext) {
        return DigestUtils.sha256Hex(plaintext);
    }
}
