package exceptionOverride;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Father {

	//you can throw exception itself(IOException) and its child class(FileNotFoundException)
	@Override
	void m1() throws IOException, FileNotFoundException {		
	}

	//you cannot handle unchecked exception
	@Override
	void m2() {
	}

	//you can use less throwing exception, because you can handle exception in child
	@Override
	void m3() {	
	}

}
