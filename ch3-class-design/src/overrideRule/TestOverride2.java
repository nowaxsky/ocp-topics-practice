package overrideRule;

public class TestOverride2 {

	public static void main(String[] args) {
		
		Super2 s1 = new Sub2();
		
		//bad invoke method
		System.out.println(s1.reportSum());
		
		//bad invoke method
		System.out.println(s1.num);
		
		//good way to call reportSum()
		System.out.println(Super2.reportSum());
		
		//field shadowing
		System.out.println(Super2.num);
		
		Sub2 s2 = new Sub2();
		
		//bad invoke method
		System.out.println(s2.reportSum());
		
		//bad invoke method
		System.out.println(s2.num);
		
		//although static method cannot override, but we can use following method to call reportSum() in Sub2
		System.out.println(Sub2.reportSum());
		
		//field shadowing
		System.out.println(Sub2.num);
		
	}

}
