package staticImport;

import java.io.File;
import static java.io.File.separator;
import static java.io.File.*;

public class Main {

	public static void main(String[] args) {
		//need import java.io.File to compile
		System.out.println(File.separator);
		
		//need import java.io.File.separator to compile
		System.out.println(separator);
		
		//need import java.io.File.* to compile
		System.out.println(pathSeparator);

	}

}
