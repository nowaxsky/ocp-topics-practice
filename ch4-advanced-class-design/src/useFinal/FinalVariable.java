package useFinal;

public class FinalVariable {

	public static void main(String[] args) {
		
		final int[] arr = new int[2];
		
		//compile successfully
		arr[0] = 1;
		
		final int i = 1;
		
		//compile error
//		i = 2;
		
		//initialization can separate with declaration
		final int localVar;
		localVar = 42;

	}

}
