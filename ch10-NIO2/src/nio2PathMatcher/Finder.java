package nio2PathMatcher;

import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Finder extends SimpleFileVisitor<Path> {

	PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + "*.java");
	int numMatches;
	
	private void find(Path file) {
		Path name = file.getFileName();
		if(name != null && matcher.matches(name)) {
			numMatches++;
			System.out.println(file);
		}
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		find(file);
		return FileVisitResult.CONTINUE;
	}
}
