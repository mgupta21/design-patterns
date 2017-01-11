package org.java.designpatterns.template;

/**
 * Created by mgupta on 1/10/17.
 */
public class QueryPeople extends AbstractQuery {

	@Override
	String getQueryString() {
		return "SELECT * FROM PEOPLE";
	}

	/*@Override
	public Result execute() {
		Connection c = new Connection();
		Result r = c.execute("SELECT * FROM PEOPLE");
		c.close();
		return r;
	}*/
}
