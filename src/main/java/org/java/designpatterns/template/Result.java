package org.java.designpatterns.template;

/**
 * Created by mgupta on 1/10/17.
 */
public class Result {

	String result;

	public Result(String result) {
		this.result = result;
	}

	public void printOutput() {
		System.out.println(result);
	}
}
