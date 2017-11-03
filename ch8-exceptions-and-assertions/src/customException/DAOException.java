package customException;

public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 298669382716456378L;

	public DAOException() {
		super();
	}
	
	public DAOException(String message) {
		super(message);
	}

//	how to use custome exception?
//	
//	try {
//		//some codes
//	} catch(Exception e) {
//		throw new DAOException();
//	}
//	
//	if you want to throw out original exception, 
//	you have to wrap original exception in custom exception,
//	see following method,
	
	
	public DAOException(Throwable cause) {
		super(cause);
	}
	
	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
//	try {
//		//some codes
//	} catch(DAOException e) {
//		Throwable t = e.getCause();
//	}
//	
//	you can use getCause() to get original exception
}
