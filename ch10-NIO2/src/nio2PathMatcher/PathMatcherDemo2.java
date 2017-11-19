package nio2PathMatcher;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMatcherDemo2 {

	public static void main(String[] args) {
		Path root = Paths.get("").toAbsolutePath();
		
		System.out.println("root: " + root);
		
		Finder finder = new Finder();
		try {
			Files.walkFileTree(root, finder);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		System.out.println("----\n" + finder.numMatches + " found!!");

	}

}
