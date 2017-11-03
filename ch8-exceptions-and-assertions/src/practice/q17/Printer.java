package practice.q17;

public class Printer implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Printer closed");		
	}
	
	public void print() {
		System.out.println("Print.");
	}

}
