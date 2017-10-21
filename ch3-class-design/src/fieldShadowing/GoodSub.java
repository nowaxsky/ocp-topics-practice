package fieldShadowing;

public class GoodSub extends GoodSuper {

	public int reportSum() {
		return 10 + getResult();
	}
}
