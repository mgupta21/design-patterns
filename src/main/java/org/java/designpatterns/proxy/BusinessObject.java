package org.java.designpatterns.proxy;

/**
 * Created by mgupta on 8/5/16.
 */
abstract class BusinessObject {
    abstract void sayHi();

    public static BusinessObject create() {
        return new BusinessObjectProxy(new BusinessObjectImpl());
    }
}
