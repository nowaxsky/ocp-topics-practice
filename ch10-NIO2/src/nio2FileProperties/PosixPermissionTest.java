package nio2FileProperties;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixPermissionTest {

	public static void main(String[] args) {
		boolean isPOSIX = false;
		
		//how to get all supported AttributeViews in this OS
		Set<String> views = FileSystems.getDefault().supportedFileAttributeViews();
		for(String s: views) {
			System.out.println(s);
			if(s.equals("posix")) isPOSIX = true;
		}
		if(isPOSIX) {
			Path p = Paths.get(args[0]);
			Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x---");
			
			//transfer file permission to file properties
			FileAttribute<Set<PosixFilePermission>> attrs = PosixFilePermissions.asFileAttribute(perms);
			
			try {
				Files.createFile(p, attrs);
			} catch (FileAlreadyExistsException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
