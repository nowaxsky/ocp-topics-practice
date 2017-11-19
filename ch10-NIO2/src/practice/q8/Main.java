package practice.q8;

import java.io.File;
import java.nio.file.Path;

public class Main {

	private static String displayNamePart(String path, int location) {
		Path p = new File(path).toPath();
		String name = p.getName(location).toString();
		return name;
	}
	
	public static void main(String[] args) {
		
		//although first location not traditional path but still work 
		String path = "program//doc//index.html";
		String result = displayNamePart(path, 2);
		System.out.println(result);

	}

}
