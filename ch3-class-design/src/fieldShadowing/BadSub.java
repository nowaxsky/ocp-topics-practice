package fieldShadowing;

public class BadSub extends BadSuper {

	//field shadowing
	//result is same with BadSuper field
	protected int result = 30;
	
	public int reportSum() {
		return 10 + result;
	}
}
