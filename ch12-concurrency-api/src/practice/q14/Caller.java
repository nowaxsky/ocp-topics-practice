package practice.q14;

import java.util.concurrent.Callable;

public class Caller implements Callable<String> {

	String s;
	public Caller(String s) {
		super();
		this.s = s;
	}
	
	@Override
	public String call() throws Exception {
		return s + " Caller";
	}

}
