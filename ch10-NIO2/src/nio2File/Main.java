package nio2File;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.regex.PatternSyntaxException;

public class Main {

	private static void testExists() {
		String thisJava = System.getProperty("user.dir") + "\\src\\Test.java";
		Path p = Paths.get(thisJava);
		
		boolean b = Files.exists(p);
		System.out.format("%s exists: %b%n", p, b);
		
		//LinkOption.NOFOLLOW_LINKS represents not checking source file exists or not
		b = Files.notExists(p, LinkOption.NOFOLLOW_LINKS);
		System.out.format("%s does not exists: %b%n", p, b);
	}
	
	private static void testDeleteAndCreate() {

		try {	
			Path dir = Paths.get(System.getProperty("user.dir") + "\\src\\test");
			Path notExist = Paths.get(System.getProperty("user.dir") + "\\src\\notExist.txt");
			Path file = Paths.get(System.getProperty("user.dir") + "\\src\\test\\test.txt");
			Path deepFile = Paths.get(System.getProperty("user.dir") + "\\src\\test\\a\\b\\c");
			Path deepFile1 = Paths.get(System.getProperty("user.dir") + "\\src\\test\\a\\b");
			Path deepFile2 = Paths.get(System.getProperty("user.dir") + "\\src\\test\\a");
							
			Files.deleteIfExists(file);
			Files.delete(deepFile);
			Files.delete(deepFile1);
			Files.delete(deepFile2);
			Files.delete(dir);
			Files.deleteIfExists(notExist);
			Files.createDirectory(dir);
			Files.createFile(file);
			Files.createDirectories(deepFile);
			
			System.out.println("test file is readable: " + Files.isReadable(file));
			System.out.println("test file is writable: " + Files.isWritable(file));
			System.out.println("test file is executable: " + Files.isExecutable(file));
			System.out.println("\n" + file.toString()  + "\nand\n" + dir.toString()+ "\nare same files? " + Files.isSameFile(file, dir));
			
			
		} catch (NoSuchFileException e) {
			e.printStackTrace();
		} catch (DirectoryNotEmptyException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static void testCopyStream() throws IOException {
		Path to = Paths.get(System.getProperty("user.dir") + "\\oracle.html").toAbsolutePath();
		URL url = URI.create("https://www.oracle.com/").toURL();
		try(InputStream from = url.openStream()) {
			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Copy finished...");
		} 
	}
	
	/*
	 * print out the D directory content(just 1st-layer)
	 */
	private static void testDirectoryContent() {
		Path dir = Paths.get("D:/");
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*")) {
			for(Path file: stream) {
				System.out.println(file.getFileName());
			}
			
		} catch (PatternSyntaxException | DirectoryIteratorException | IOException e) {
			System.err.println(e);
		}
	}
	
	private static void testFileReadAndWrite() throws IOException {
		Path source = Paths.get(System.getProperty("user.dir") + "\\file1.txt").toAbsolutePath();
		Charset cs = Charset.defaultCharset();
		List<String> lines = Files.readAllLines(source, cs);
		Path target = Paths.get(System.getProperty("user.dir") + "\\file2.txt").toAbsolutePath();
		Files.write(target, lines, cs, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		System.out.println("done...");
	}

	
	public static void main(String[] args) throws IOException {	
		//if both are false, it means status unknown, the normal reason probably are following,
		//1. have no right
		//2. off-line drive, like CD-ROM
		testExists();
		System.out.println("\n======\n");
		
		//testDeleteAndCreate();
		System.out.println("\n======\n");

		testCopyStream();
		System.out.println("\n======\n");
		
		testDirectoryContent();
		System.out.println("\n======\n");
		
		testFileReadAndWrite();
	}

}
