package org.java.designpatterns.proxy;

/**
 * Created by mgupta on 8/5/16.
 */
public class PoxyApp {
    public static void main(String[] args) {
        BusinessObject obj = BusinessObject.create();
        obj.sayHi();
    }
}
