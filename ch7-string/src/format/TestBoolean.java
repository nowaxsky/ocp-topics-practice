package format;

public class TestBoolean {

	public static void main(String[] args) {
		System.out.printf("%B, %4b, %.2b%n", true, false, true);
		System.out.printf("%b, %6b, %.4b%n", "A", "B", "C");
		System.out.printf("%b %n", 2016);
		System.out.printf("%b %n", new Object());
		System.out.printf("%b %n", null);
	}
}
