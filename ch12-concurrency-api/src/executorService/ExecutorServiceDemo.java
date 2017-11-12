package executorService;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		//choose one line to try
		ExecutorService es = Executors.newCachedThreadPool();
//		ExecutorService es = Executors.newFixedThreadPool(5);
		Callable<String> task = new CallableTask();
		Future<String> future = es.submit(task);
		try {
			
			//try to add block comment of following two lines
//			String result = future.get();
//			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//all threads finish will execute
		es.shutdown();
		System.out.println(new Date() + ": service shutdown");
		
		try {
			es.awaitTermination(3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("stopped waiting early");
		}

	}

}
