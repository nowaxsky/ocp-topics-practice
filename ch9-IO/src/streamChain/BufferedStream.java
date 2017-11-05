package streamChain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedStream {

	public static void main(String[] args) {
		String source = "test-data-input.txt";
		String target = "buffer-data-output.txt";
		
		//decorator pattern
		try(BufferedReader in = new BufferedReader(new FileReader(source));
			BufferedWriter out = new BufferedWriter(new FileWriter(target))) {

			String line = "";
			while((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}
			

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
