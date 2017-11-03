package practice.q17;

public class Scanner implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Scanner closed");		
	}
	
	public void scan() throws Exception {
		System.out.println("Scan.");
		throw new Exception("Unable to scan.");
	}

}
