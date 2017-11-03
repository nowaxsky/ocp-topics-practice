package customException;

import java.io.IOException;

public class WrappingException {

	public static void main(String[] args) {
		try {
			findById(5);
		} catch (Exception e) {
			Throwable t = e.getCause();
			System.out.println(t.getClass());
			System.out.println(e.getClass());
		}

	}
	
	private static void findById(int id) throws DAOException {
		try {
			throw new IOException();
			
		} catch (IOException e) {
			
			//you can wrap the original error in DAOException
			throw new DAOException(e);
		}
	}

}
