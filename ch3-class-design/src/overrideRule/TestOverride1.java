package overrideRule;

public class TestOverride1 {

	public static void main(String[] args) {
		
		Super1 s1 = new Sub1();
		
		//field shadowing
		System.out.println(s1.reportSum());
		
		//field cannot override
		System.out.println(s1.num);
		
		Sub1 s2 = new Sub1();
		
		System.out.println(s2.reportSum());
		
		System.out.println(s2.num);
		
	}

}
