package practice.q3;

public class FileThreadPrint implements Runnable {

	String fName;
	
	public FileThreadPrint(String fName) {
		this.fName = fName;
	}
	@Override
	public void run() {
//		System.out.println(fName);
		System.out.println(Thread.currentThread().getName());
		
	}

}
