package useFinal;

import java.util.Date;

public class FinalField {

	//if you want to use final field, you have to initialize directly or in constructor
	
	private final int field;
	private final int forgottenField;
	
	//initialize directly
	private final Date now = new Date();
	
	//static + final should use upper case and underscore
	public static final int SYSTEM_VAR = 10;
	
	//initialize in constructor
	public FinalField() {
		field = 100;
		forgottenField = 200;
	}
	
	//compile error, you should initialize all variables
//	public FinalField(Object o) {
//		field = 300;
//	}
}
