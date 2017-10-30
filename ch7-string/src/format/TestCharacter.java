package format;

public class TestCharacter {

	public static void main(String[] args) {
		//byte, short, int
		byte b = 126;
		short bb = new Byte(b);
		short s = 1277;
		Short ss = new Short(s);
		int i = 1299;
		Integer ii = new Integer(i);
		char c1 = 1234;
		char c2 = '\u8A2D';
		Character cc = new Character(c2);
		
		System.out.printf("%C%n", 'b');
		System.out.printf("%c%n", b);
		System.out.printf("%C%n", bb);
		System.out.printf("%C%n", s);
		System.out.printf("%c%n", ss);
		System.out.printf("%C%n", i);
		System.out.printf("%C%n", ii);
		System.out.printf("'%5C'%n", c1);
		System.out.printf("'%-5C'%n", c2);
		System.out.printf("%C%n", cc);
		
		System.out.println(Character.isValidCodePoint(1299));

	}

}
