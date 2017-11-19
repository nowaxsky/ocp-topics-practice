package nio2Path;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * All Classes in java.nio.file are to define or position the files,
 * instead of controlling files,
 * so they don't need to handle exceptions
 * 
 * @author CPM
 *
 */
public class Main {
	
	/*
	 * how to define file?(instead of controlling)
	 * 1. FileSystem getPath()
	 * 2. Paths get()
	 * 
	 */
	private static void getPathMethod() {
		FileSystem fs = FileSystems.getDefault();
		Path p1 = fs.getPath("D:\\Eclipse\\Java-SE\\tutorials\\ocp-topics-practice\\ch10-NIO2\\noexisting.txt");
		Path p2 = fs.getPath("D:/Eclipse/Java-SE/tutorials/ocp-topics-practice/ch10-NIO2/noexisting.txt");
		
		System.out.format("getFileName: %s%n", p1.getFileName());
		System.out.format("getFileName: %s%n", p2.getFileName());
	}
	
	private static void getMethod() {
		Path p1 = Paths.get("D:\\Eclipse\\Java-SE\\tutorials\\ocp-topics-practice\\ch10-NIO2\\noexisting.txt");
		Path p2 = Paths.get("D:/Eclipse/Java-SE/tutorials/ocp-topics-practice/ch10-NIO2/noexisting.txt");
		Path p3 = Paths.get("D:", "Eclipse", "Java-SE", "tutorials", "ocp-topics-practice", "ch10-NIO2/noexisting.txt");
		Path p4 = Paths.get("/temp/foo");
		Path p5 = Paths.get(URI.create("file:///~/somefile"));
		
		System.out.format("getFileName: %s%n", p1.getFileName());
		System.out.format("getFileName: %s%n", p2.getFileName());
		System.out.format("getFileName: %s%n", p3.getFileName());
		System.out.format("getFileName: %s%n", p4.getFileName());
		System.out.format("getFileName: %s%n", p5.getFileName());
	}

	private static void testSplit() {
		Path p1 = Paths.get("D:/Eclipse/Java-SE/tutorials/ocp-topics-practice/ch10-NIO2/noexisting.txt");
		
		System.out.format("getFileName: %s%n", p1.getFileName());
		System.out.format("getParent: %s%n", p1.getParent());
		
		//exclusive root
		System.out.format("getNameCount: %s%n", p1.getNameCount());
		System.out.format("getRoot: %s%n", p1.getRoot());
		System.out.format("isAbsolute: %s%n", p1.isAbsolute());
		System.out.format("toAbsolutePath: %s%n", p1.toAbsolutePath());
		System.out.format("toUri: %s%n", p1.toUri());
	}
	
	private static void testNormalize() {
		Path p1 = Paths.get("/home/./clarence/foo");
		p1 = p1.normalize();
		System.out.println(p1);
		
		Path p2 = Paths.get("/home/peter/../clarence/../foo");
		p2 = p2.normalize();
		System.out.println(p2);
		
	}
	
	private static void testSubPath() {
		Path p1 = Paths.get("D:/index0/index1/index2/index3/index4/index5");
		p1.subpath(1, 3);
		System.out.println(p1);
		
		p1 = p1.subpath(1, 4);
		System.out.println(p1);
	}
	
	private static void testResolve() {
		String p = "/home/clarence/foo";
		
		//pass by relative path
		Path p1 = Paths.get(p).resolve("bar");
		System.out.println(p1);
		
		//pass by absolute path
		Path p2 = Paths.get(p).resolve("/home/clarence");
		System.out.println(p2);
	}
	
	private static void testRelativize() {
		Path p1 = Paths.get("/test/peter");
		Path p2 = Paths.get("/jim");
		
		Path p1Top2 = p1.relativize(p2);
		System.out.println(p1Top2);
		
		Path p2Top1 = p2.relativize(p1);
		System.out.println(p2Top1);
	}
	
	
	public static void main(String[] args) {
		getPathMethod();
		System.out.println("\n======\n");
		
		getMethod();
		System.out.println("\n======\n");
		
		testSplit();
		System.out.println("\n======\n");
		
		testNormalize();
		System.out.println("\n======\n");
		
		testSubPath();
		System.out.println("\n======\n");
		
		testResolve();
		System.out.println("\n======\n");
		
		testRelativize();
	}

}
