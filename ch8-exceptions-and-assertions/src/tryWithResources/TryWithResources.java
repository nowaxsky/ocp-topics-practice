package tryWithResources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {

	public static void main(String[] args) {
		System.out.println("Opening a file...");
		
		//InputStream implements Closeable which implements AutoCloseable
		//when try is over, file will be closed auto
		try(InputStream in = new FileInputStream("lostFile.txt")) {
			System.out.println("File is opened");
			int data = in.read();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
