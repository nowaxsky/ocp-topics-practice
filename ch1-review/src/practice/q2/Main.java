package practice.q2;

public class Main {

	public static void main(String[] args) {
		new OCPtest().calInt(5);
		
		//Exception in thread "main" java.lang.NullPointerException
		//if you don't initialize Integer, the default value is null instead of 0
		new OCPtest().calInteger(5);		
	}

}
