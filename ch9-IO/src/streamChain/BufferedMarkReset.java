package streamChain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedMarkReset {

	public static void main(String[] args) throws Exception {

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			System.out.println("Is markSupported on ...");
			String f = System.getProperty("user.dir") + "\\buffered-mark-reset.txt";
			
			is = new FileInputStream(f);
			System.out.println("FileInputStream? " + is.markSupported());
			
			isr = new InputStreamReader(is);
			System.out.println("InputStreamReader? " + isr.markSupported());
			
			//only BufferedReader supports mark-reset(or push-back)
			br = new BufferedReader(isr);
			System.out.println("FileInputStream? " + br.markSupported());
			
			System.out.println("-------");
			
			System.out.println((char) br.read());
			System.out.println((char) br.read());			
			br.mark(99);;
			System.out.println("mark() invoked");
			
			System.out.println((char) br.read());
			System.out.println((char) br.read());			
			br.reset();			
			System.out.println("reset() invoked");
			
			System.out.println((char) br.read());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(is != null) is.close();
			if(isr != null) isr.close();
			if(br != null) br.close();
		}
	}

}
