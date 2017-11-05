package channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ByteChannel {

	public static void main(String[] args) {
		String source = "test-data-input.txt";
		String target = "channel-data-output.txt";
		
		try(FileChannel in = new FileInputStream(source).getChannel();
			FileChannel out = new FileOutputStream(target).getChannel()) {
			
			ByteBuffer buff = ByteBuffer.allocate((int) in.size());
			in.read(buff);
			
			//from where
			buff.position(10);
			out.write(buff);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
