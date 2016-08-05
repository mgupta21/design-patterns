package org.java.designpatterns.proxy;

/**
 * Created by mgupta on 8/5/16.
 */
public class BusinessObjectProxy extends BusinessObject {

    private final BusinessObject target;

    public BusinessObjectProxy(BusinessObject target) {
        this.target = target;
    }

    @Override
    public void sayHi() {
        System.out.println("forwarding request to real...");
        this.target.sayHi();
        System.out.println("completed call to real...");
    }
}
