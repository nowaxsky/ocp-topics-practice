package practice.q7;

public class Resource implements AutoCloseable {

	public Resource() throws Exception {
		System.out.println("The resource is created");
		//throw new ResourceOpenException();
	}
	
	public void work() throws Exception {
		System.out.println("The resource is working");
		throw new ResourceWorkingException();
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("The resource is closed");
		//throw new ResourceCloseException();		
	}

}
