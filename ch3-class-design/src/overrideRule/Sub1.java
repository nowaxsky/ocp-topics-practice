package overrideRule;

public class Sub1 extends Super1 {

	//field shadowing
	protected int result = 30;
	
	public int reportSum() {
		return 10 + result;
	}
}
