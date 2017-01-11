package org.java.designpatterns.template;

/**
 * Created by mgupta on 1/10/17.
 */
public class Main {

    public static void main(String[] args) {
        Query qP = new QueryPeople();
        executeQuery(qP);
        Query qC = new QueryCompanies();
        executeQuery(qC);
    }

    private static void executeQuery(Query q) {
        Result r = q.execute();
        r.printOutput();
    }
}
