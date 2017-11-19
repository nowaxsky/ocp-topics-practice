package nio2PathMatcher;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/*
 * use following method to search file or directory
 * PathMatcher matcher = FileSystems.getDefault().getPathMatcher(String syntaxAndPattern);
 * 
 * syntax: glob(global command) or regex(regular expression)
 * 
 */
public class PathMatcherDemo1 {

	public static void main(String[] args) {
		FileSystem fileSystem = FileSystems.getDefault();
		Path path = Paths.get("D:/Test.java");
		System.out.println(path);
		
		PathMatcher pathMatcher1 = fileSystem.getPathMatcher("glob:D:/*.java");
		System.out.println(pathMatcher1.matches(path));
		
		PathMatcher pathMatcher2 = fileSystem.getPathMatcher("glob:D:/*/*.java");
		System.out.println(pathMatcher2.matches(path));
		
		PathMatcher pathMatcher3 = fileSystem.getPathMatcher("glob:D:/**/*.java");
		System.out.println(pathMatcher3.matches(path));

	}

}
