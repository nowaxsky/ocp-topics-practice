package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		Properties props = new Properties();
		try {
			FileInputStream fis = new FileInputStream("test.properties");
			props.load(fis);
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("error: " + e.getMessage());
		}
		System.out.println("server: " + props.getProperty("hostname"));
		System.out.println("username: " + props.getProperty("username"));
		System.out.println("password: " + props.getProperty("password"));
	}

}
