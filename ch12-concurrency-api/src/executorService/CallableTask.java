package executorService;

import java.util.Date;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(20000);
		System.out.println(new Date() + ": finish job");
		return (new Date() + ": done");
	}

}
