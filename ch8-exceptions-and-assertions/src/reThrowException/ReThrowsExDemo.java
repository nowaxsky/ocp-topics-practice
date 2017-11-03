package reThrowException;

public class ReThrowsExDemo {

	//before Java 7
	private static void reThrowExBeforeJ7() throws Exception {
		try {
			if(Math.random() > 0.5) {
				throw new Exception1();
			} else {
				throw new Exception2();
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	//after Java 7
	private static void reThrowExAfterJ7() throws Exception1, Exception2 {
		try {
			if(Math.random() > 0.5) {
				throw new Exception1();
			} else {
				throw new Exception2();
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		try {
			reThrowExBeforeJ7();
			reThrowExAfterJ7();
		} catch (Exception e) {
			e.printStackTrace();
		}	

	}

}
