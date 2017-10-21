package overrideRule;

public class DeepA extends Deeper {

	//you cannot use protected or private to override public method
	//you can use same class(Number) or child class(Integer, Double...) for return value
	//you have to use same method signature
	@Override
	public Integer getDepth(Number n) {
		return 5;
	}
}
