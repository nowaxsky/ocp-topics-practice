package nio2File.channelAndIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
	
	private static void testSeekableByteChannel() throws IOException {
		Path path = Paths.get(System.getProperty("user.dir") + "\\file1.txt").toAbsolutePath();
		try(SeekableByteChannel sbc = Files.newByteChannel(path, StandardOpenOption.WRITE)) {
			long channelSize = sbc.size();
			sbc.position(channelSize);
			System.out.println("position: " + sbc.position());
			ByteBuffer buffer = ByteBuffer.wrap(("\n" + "0").getBytes());
			sbc.write(buffer);
			System.out.println("position: " + sbc.position());
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		testSeekableByteChannel();
	}

}
