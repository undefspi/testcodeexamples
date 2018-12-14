package gangoffour.simpleFactoryPattern;

import java.security.acl.AclNotFoundException;

/**
 * Created by chris on 10/12/2018.
 */
public class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Dog says: Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println ("Dogs prefer barking...");
    }
}
