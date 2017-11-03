package multiCatch;

import java.io.File;
import java.io.IOException;

public class MultiCatch {

	public static void main(String[] args) {
		before7();
		after7();
	}

	private static void after7() {
		try {
			createTempFile();
			
		//you can use multi-catch divided by |
		//those exceptions cannot be extended from the others(so Exception cannot be put in this layer)
		} catch (IOException | IllegalArgumentException | ArrayIndexOutOfBoundsException | SecurityException e) {
			System.out.println("Known Exception: " + e.getClass());
		} catch (Exception e) {
			System.out.println("Unexpected Exception: " + e.getClass() + "is caught!");
		}
		
	}



	private static void before7() {
		try {
			createTempFile();
		} catch (IOException e) {
			System.out.println("Known Exception: " + e.getClass());
		} catch (IllegalArgumentException e) {
			System.out.println("Known Exception: " + e.getClass());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Known Exception: " + e.getClass());
		} catch (SecurityException e) {
			System.out.println("Known Exception: " + e.getClass());
		} catch (Exception e) {
			System.out.println("Unexpected Exception: " + e.getClass() + "is caught!");
		}
		
	}
	
	private static void createTempFile() throws IOException {
		String path = System.getProperty("user.dir") + "/src/temp";
		System.out.println(path);
		File f = new File(path);
		File tf = File.createTempFile("ji", null, f);
		System.out.println("Temp file name: " + tf.getPath());
		int[] arr = new int[5];
		arr[5] = 25;		
	}	

}
