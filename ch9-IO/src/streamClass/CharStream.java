package streamClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStream {

	/*
	 * There are 2 classes control the stream of char:
	 * 
	 * FileReader
	 * FileWriter
	 */
	public static void main(String[] args) {
		String source = "test-data-input.txt";
		String target = "char-data-output.txt";
		char[] c = new char[24];
		int cLen = c.length;
		
		try(FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(target)) {
			
			int read = 0;
			while((read = fr.read(c)) != -1) {
				System.out.println(read);
				if(read < cLen) {
					fw.write(c, 0, read);
				} else {
					fw.write(c);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
