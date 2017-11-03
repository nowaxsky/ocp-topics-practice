package tryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Throwable Family
 * 
 * NullPointerException				->RuntimeException	->Exception	->Throwable	->Object
 * ArrayIndexOutOfBoundsException	->					|			|			|			
 * IllegalArgumentException			->					|			|			|
 * ArithmeticException				->					|			|			|
 * SecurityException				->					|			|			|
 * ------------------------------------------------------			|			|
 * FileNotFoundException			->IOException		->			|			|
 * -----------------------------------------------------			|			|
 * 									  SQLException		->			|			|
 * ------------------------------------------------------------------			|
 * 									  AssertionError	->Error		->			|
 * 									  OutOfMemoryError	->			|			|
 * ----------------------------------------------------------------------------------------
 * 
 * @author CPM
 *
 */
public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("Opening a file...");
			InputStream in = new FileInputStream("lostFile.txt");
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
