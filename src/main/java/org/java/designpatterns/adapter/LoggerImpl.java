package org.java.designpatterns.adapter;

/**
 * Created by mgupta on 8/7/16.
 */
public class LoggerImpl extends Logger {
    @Override
    public void debug(String str) {
        System.out.print("DEBUG : ");
        printMessage(str);
    }

    @Override
    public void trace(String str) {
        System.out.print("TRACE : ");
        printMessage(str);
    }

    @Override
    public void log(String str) {
        System.out.print("LOG : ");
        printMessage(str);
    }

    private void printMessage(String str) {
        System.out.println(str);
    }
}
