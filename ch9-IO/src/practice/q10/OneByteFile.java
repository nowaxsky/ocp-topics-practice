package practice.q10;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OneByteFile {

	public static void main(String[] args) {
		try {
			OutputStream fos = new FileOutputStream(new File("file"));
			DataOutputStream dos = new DataOutputStream(fos);
			
			//75 is K
			dos.writeByte(75);
			dos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
