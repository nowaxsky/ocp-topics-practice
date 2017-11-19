package nio2FileTree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/*
 * SimpleFileVisitor has implemented FileVisitor, so you just override method for custom demand
 */
public class SimplePrintTree extends SimpleFileVisitor<Path> {

	private int i;
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println(++i + ".\tvisitFile: " + file);
		if(attrs.isSymbolicLink()) {
			System.out.println("\t --> " + file.getFileName() + " is SymbolicLink");
		}
		return FileVisitResult.CONTINUE;
	}
}
