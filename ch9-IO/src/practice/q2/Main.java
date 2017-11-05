package practice.q2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		String file = "somefile.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";
			int count = 1;
			line = br.readLine();
			do {
				line = br.readLine();
				System.out.println(count + ".:" + line);
			} while (line != null);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
