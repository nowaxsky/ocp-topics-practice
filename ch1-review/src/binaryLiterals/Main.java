package binaryLiterals;

public class Main {

	public static void main(String[] args) {
		//use 0b or 0B to implement binary literals		
		//RHS is int in following examples
		
		//8-bit 'byte' value
		byte b = 0b0001_0001;
		
		//16-bit 'short' value
		short s = (short) 0b1001_0001_0100_0101;
		
		//32-bit 'int' value
		int i = 0B1001_0001_0100_0101_1010;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
	}

}
