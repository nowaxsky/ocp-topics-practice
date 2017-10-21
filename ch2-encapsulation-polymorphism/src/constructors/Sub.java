package constructors;

public class Sub extends Super{

	public Sub(String s) {
		super(s);
		System.out.println("Sub1");
	}
	
	public Sub(String s1, String s2) {
		this(s1);
		System.out.println("Sub2");
	}
}
