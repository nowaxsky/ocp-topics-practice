package practice.q12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("src\\resources\\Message.properties");
		
		p.load(fis);
		System.out.println(p.getProperty("welcome1"));
		
		//custom value when String is not found
		System.out.println(p.getProperty("welcome2", "java"));
		
		//when String is not found show null(by default)
		System.out.println(p.getProperty("welcome3"));

	}

}
