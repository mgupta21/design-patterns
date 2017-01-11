package org.java.designpatterns.template;

/**
 * Created by mgupta on 1/10/17.
 */
public class Connection {

    public Result execute(String s) {
        if (s.equals("SELECT * FROM PEOPLE")) {
            return new Result("joe, mark, tina, mili");
        } else if (s.equals("SELECT * FROM COMPANIES")) {
            return new Result("apple, google, sony");
        }
        return new Result("");
    }

    public void close() {
        // No-Opt
    }
}
