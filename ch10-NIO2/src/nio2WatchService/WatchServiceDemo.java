package nio2WatchService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchService;

public class WatchServiceDemo {

	final static String DIRECTORY_TO_WATCH = "D:\\Eclipse\\Java-SE\\tutorials\\ocp-topics-practice\\ch10-NIO2\\src";
	
	public static void main(String[] args) throws Exception {
		Path watchPath = Paths.get(DIRECTORY_TO_WATCH);
		if(Files.exists(watchPath) == false) {
			Files.createDirectories(watchPath);
		}
		
		WatchService myWatcher = watchPath.getFileSystem().newWatchService();
		MyWatchService fileWatcher = new MyWatchService(myWatcher);
		
		Thread thread = new Thread(fileWatcher);
		thread.start();
		
		watchPath.register(myWatcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);

	}

}
