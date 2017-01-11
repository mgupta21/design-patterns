package org.java.designpatterns.template;

/**
 * Created by mgupta on 1/10/17.
 */
public abstract class AbstractQuery implements Query {

    @Override
    public Result execute() {
        Connection c = new Connection();
        Result r = c.execute(getQueryString());
        c.close();
        return r;
    }

    abstract String getQueryString();
}
