package practice.q3;

public class Main {

	public static void main(String[] args) {
		System.out.println("start ");
		try {
			int i = 1 / 0;
			System.out.println("try ");
		} catch (Exception e) {
			System.out.println("catch ");
			
			//you don't have to use throws Exception after method, because ArithmeticException is unchecked exception
			throw e;
		} finally {
			System.out.println("finally ");
		}
		System.out.println("after ");
		

	}
	

}
