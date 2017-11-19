package nio2FileProperties;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;

public class DosFileAttributesWriteDemo {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get(System.getProperty("user.dir") + "/src/test/test.txt").toAbsolutePath();
		
		//DosFileAttributeView is for "modifying" file properties
		DosFileAttributeView view = Files.getFileAttributeView(p, DosFileAttributeView.class);
		
		view.setArchive(true);
		view.setReadOnly(true);
		view.setHidden(true);
		view.setSystem(true);
		
		FileTime lastModifiedTime = FileTime.fromMillis(new Date().getTime());
		FileTime lastAccessTime = FileTime.fromMillis(new Date().getTime());
		FileTime createTime = FileTime.fromMillis(new Date().getTime());
		
		view.setTimes(lastModifiedTime, lastAccessTime, createTime);
		
		//DosFileAttributes is for "reading" file properties
		DosFileAttributes attrs = view.readAttributes();

	}

}
