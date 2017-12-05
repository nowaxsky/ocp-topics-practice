package practice.q3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		Stream<Path> files = Files.walk(Paths.get("src/practice"));
		
		//print files names concurrently
		files.forEach(f -> {es.execute(new FileThreadPrint(f.getFileName().toString()));});
		
		es.shutdown();
		es.awaitTermination(5, TimeUnit.DAYS);

	}

}
