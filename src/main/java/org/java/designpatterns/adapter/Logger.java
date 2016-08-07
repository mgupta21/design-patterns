package org.java.designpatterns.adapter;

/**
 * Created by mgupta on 8/7/16.
 */
public abstract class Logger {
    abstract public void debug(String str);

    abstract public void trace(String str);

    abstract public void log(String str);

    public static Logger create() {
        // return new LoggerImpl();
        // Adapted to new implementation without changing client (Main) interface
        return new LogAdapter();
    }

}
