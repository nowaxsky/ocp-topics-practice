package streamBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIO2Demo {
	
	public static void testList() throws IOException {
		
		System.out.println("====================list");
		//just first layer
		try(Stream<Path> stream = Files.list(Paths.get("src"))) {
			stream.filter(path -> path.toString().endsWith(".txt"))
				  .forEach(System.out::println);
		
		}
	}
	
	public static void testFind() throws IOException {
		
		System.out.println("\n====================find");
		/*
		 * start from src
		 * 4 layers
		 * searching condition
		 */
		try(Stream<Path> stream = Files.find(Paths.get("src"), 2, (path, attr) -> path.toString().endsWith(".txt"))) {
			stream.filter(path -> path.toString().endsWith(".txt"))
				  .forEach(System.out::println);
		
		}
	}
	
	/*
	 * this method just visit file
	 */
	public static void testWalk() throws IOException {
		
		System.out.println("\n====================walk");
		System.out.println("-- specific layer: 1 --");
		try(Stream<Path> stream = Files.walk(Paths.get("src"), 1)) {
			stream.filter(path -> path.toString().endsWith(".txt"))
				  .forEach(System.out::println);
		
		}
		System.out.println("\n-- all layers --");
		try(Stream<Path> stream = Files.walk(Paths.get("src"))) {
			stream.filter(path -> path.toString().endsWith(".txt"))
				  .forEach(System.out::println);
		
		}
	}
	
	public static void testLines() throws IOException {
		System.out.println("\n====================lines");
		try(Stream<String> stream = Files.lines(Paths.get("src/flatMap.txt"))) {
			stream.map(String::toUpperCase)
				  .forEach(System.out::println);
		
		}
	}
	
	/*
	 * in java 8, BufferedReader has lines() method
	 */
	public static void testNewBufferedReader() throws IOException {
		System.out.println("\n====================newBufferedReader");
		try(BufferedReader reader = Files.newBufferedReader(Paths.get("src/flatMap.txt"))) {
			reader.lines()
				  .map(String::toUpperCase)
				  .forEach(System.out::println);
		
		}
	}

	public static void main(String[] args) throws IOException {
		testList();
		testFind();
		testWalk();
		testLines();
		testNewBufferedReader();

	}

}
