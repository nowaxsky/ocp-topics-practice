package nio2FileTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkFileTreeDemo {

	public static void main(String[] args) {
		Path path = Paths.get(System.getProperty("user.dir") + "/src").toAbsolutePath();
		
		/*
		 * FileVisitor is DFS(Depth-first search)
		 */
		try {
			
			Files.walkFileTree(path, new PrintTree());			
			//try
//			Files.walkFileTree(path, new SimplePrintTree());
		} catch (IOException e) {
			System.out.println("Exception: " + e);
		}

	}

}
