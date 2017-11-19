package nio2FileProperties;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Date;

public class MetadataTest {

	public static void main(String[] args) throws IOException {
		Path basic = Paths.get(System.getProperty("user.dir") + "/src/metadata").toAbsolutePath();
		System.out.println("basic path: " + basic);
		
		Path common = basic.resolve("file.txt");
		Path shortcut = basic.resolve("dir.shortcut");
		Path hidden = basic.resolve("hiddenFile");
		Path symlink = basic.resolve("dir.sl");

		System.out.println("size: " + Files.size(common));
		System.out.println("isDirectory: " + Files.isDirectory(common));
		System.out.println("isRegularFile: " + Files.isRegularFile(common));
		System.out.println("isSymbolicLink(dir.sl): " + Files.isSymbolicLink(symlink));
		System.out.println("isSymbolicLink(dir.shortcut): " + Files.isSymbolicLink(shortcut));
		System.out.println("isHidden: " + Files.isHidden(hidden));
		
		boolean hiddenSwitch = Files.isHidden(hidden);
		
		//get and modify last modified time property
		System.out.println("getLastModifiedTime: " + Files.getLastModifiedTime(common));
		FileTime time = FileTime.fromMillis(new Date().getTime());
		Files.setLastModifiedTime(common, time);
		System.out.println("getLastModifiedTime: " + Files.getLastModifiedTime(common));
		
		//modify hidden property
		Files.setAttribute(hidden, "dos:hidden", new Boolean(!hiddenSwitch));
		System.out.println("isHidden: " + Files.getAttribute(hidden, "dos:hidden"));
		
	}

}
