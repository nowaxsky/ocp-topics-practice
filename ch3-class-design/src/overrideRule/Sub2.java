package overrideRule;

public class Sub2 extends Super2 {

	//static methods and fields cannot override
	protected static int result = 30;
	
	public static int reportSum() {
		return 10 + num;
	}
}
