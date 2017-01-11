package org.java.designpatterns.template;

/**
 * Created by mgupta on 1/10/17.
 */
public class QueryCompanies extends AbstractQuery {

    @Override
    String getQueryString() {
        return "SELECT * FROM COMPANIES";
    }
	
	/*@Override
	public Result execute() {
		Connection c = new Connection();
		Result r = c.execute("SELECT * FROM COMPANIES");
		c.close();
		return r;
	}*/
}
