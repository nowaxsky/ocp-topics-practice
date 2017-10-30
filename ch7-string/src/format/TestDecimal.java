package format;

public class TestDecimal {

	public static void main(String[] args) {
		System.out.println("1234567890");
		System.out.println("----------");
		System.out.printf("%6d, %n", 99);
		System.out.printf("%-6d, %n", 99);
		System.out.printf("%06d, %n", 99);
		System.out.printf("%6d, %n", 9999999);
		System.out.printf("%-6d, %n", 9999999);
		System.out.printf("%06d, %n", 9999999);

	}

}
