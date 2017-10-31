package format;

public class TestFloating {

	public static void main(String[] args) {
		System.out.println("123456789012345");
		System.out.println("---------------");
		
		System.out.printf("%14f, %n", 123.67);
		System.out.printf("%014f, %n", 123.67);
		System.out.printf("%-14f, %n", 123.67);
		
		System.out.println("---------------");
		System.out.printf("%.1f, %n", 123.67);
		System.out.printf("%.4f, %n", 123.67);
		System.out.printf("%14.4f, %n", 123.67);
		System.out.printf("%014.4f, %n", 123.67);
		System.out.printf("%-14.4f, %n", 123.67);
		System.out.printf("%3.5f, %n", 123.67);
		
		System.out.println("---------------");
		System.out.printf("%14f, %n", 123.1234567);
		System.out.printf("%014f, %n", 123.1234567);
		System.out.printf("%-14f, %n", 123.1234567);
		
		System.out.println("---------------");
		System.out.printf("%.1f, %n", 123.1234567);
		System.out.printf("%.4f, %n", 123.1234567);
		System.out.printf("%14.4f, %n", 123.1234567);
		System.out.printf("%014.4f, %n", 123.1234567);
		System.out.printf("%-14.4f, %n", 123.1234567);
		System.out.printf("%3.5f, %n", 123.1234567);
	}
}
