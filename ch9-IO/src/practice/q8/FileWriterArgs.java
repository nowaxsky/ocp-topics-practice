package practice.q8;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterArgs {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			
			//second arg means override original file or not,
			//true mean appending after the original content, false means overriding(same with no arg)
			fw = new FileWriter("msg.txt", true);
			fw.append("Java SE 8");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
