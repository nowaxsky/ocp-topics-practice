package format;

import java.util.ArrayList;

public class TestString {

	public static void main(String[] args) {
		System.out.printf("%s%n", "Jim");
		System.out.printf("%S%n", "jim");
		
		System.out.printf("'%4s'%n", "jim");
		System.out.printf("'%4s'%n", "jimjim");
		
		System.out.printf("'%4.2s'%n", "jim");
		System.out.printf("'%-4.2s'%n", "jim");
		
		System.out.printf("'%4.5s'%n", "jimjim");
		System.out.printf("'%-4.5s'%n", "jimjim");
		
		System.out.printf("%s, %s, %s %n", "j", "i", "m");
		System.out.printf("%3$s, %2$s, %1$s %n", "j", "i", "m");
		
		System.out.printf("%s%n", null);
		System.out.printf("%s%n", new ArrayList());

	}

}
