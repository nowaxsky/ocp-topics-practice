package fieldShadowing;

public class GoodSuper {

	//field shoule use private instead of protected
	private int result = 20;
	
	//getter use protected modifier
	protected int getResult() {
		return result;
	}
}
