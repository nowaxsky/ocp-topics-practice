package streamClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteStream {
	
	/*
	 * There are 2 classes control the stream of byte:
	 * 
	 * InputStream
	 * OutputStream
	 */
	public static void main(String[] args) {
		String source = "test-data-input.txt";
		String target = "byte-data-output.txt";
		byte[] b = new byte[24];
		int bLen = b.length;
		
		try(FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target)) {
			System.out.println("Will copy bytes: " + fis.available());
			
			int read = 0;
			while((read = fis.read(b)) != -1) {
				System.out.println(read);
				if(read < bLen) {
					fos.write(b, 0, read);
				} else {
					fos.write(b);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
