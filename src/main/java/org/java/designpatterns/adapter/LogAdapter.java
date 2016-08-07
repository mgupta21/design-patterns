package org.java.designpatterns.adapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

/**
 * Created by mgupta on 8/7/16.
 */
public class LogAdapter extends Logger {

    public Log logger = new Log4JLogger();

    @Override
    public void debug(String str) {
        logger.debug(str);
    }

    @Override
    public void trace(String str) {
        logger.trace(str);
    }

    @Override
    public void log(String str) {
        logger.info(str);
    }
}
