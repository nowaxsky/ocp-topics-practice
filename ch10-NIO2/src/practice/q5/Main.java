package practice.q5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("D:/biz.txt");
		Path p2 = Paths.get("D:/company");
		Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);

	}

}
