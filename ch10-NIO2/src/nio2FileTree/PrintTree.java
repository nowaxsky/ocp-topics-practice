package nio2FileTree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/*
 * if you want to implement FileVisitor directly, you have to implement all methods, another choice is to use SimpleFileVisitor
 */
public class PrintTree implements FileVisitor<Path> {

	private int i;
	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println(++i + ".\tpostVisitDirectory: " + dir);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println(++i + ".\tpreVisitDirectory: " + dir);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println(++i + ".\tvisitFile: " + file);
		if(attrs.isSymbolicLink()) {
			System.out.println("\t --> " + file.getFileName() + " is SymbolicLink");
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.out.println(++i + ".\tvisitFileFailed: " + file);
		return FileVisitResult.CONTINUE;
	}

}
