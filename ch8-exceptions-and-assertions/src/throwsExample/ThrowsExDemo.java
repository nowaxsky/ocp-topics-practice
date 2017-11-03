package throwsExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ThrowsExDemo {

	public static void readFromFile1() throws FileNotFoundException, IOException, Exception {
		try(InputStream in = new FileInputStream("a.txt")) {} 
	}
	
	//exceptions order does not matter
	public static void readFromFile2() throws Exception, IOException, FileNotFoundException {
		try(InputStream in = new FileInputStream("a.txt")) {} 
	}
	
	public static void main(String[] args) {
		try {
			readFromFile1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
