package practice.q14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<String> callFu = es.submit(new Caller("Call"));
		
		//although Runnable return nothing(null), but Future class still can get it instead of throwing exception
		Future runFu = es.submit(new Runner("Run"));
		
		String strCall = (String) callFu.get();
		String strRun = (String) runFu.get();
		System.out.println(strCall + "-" + strRun);
	}

}
