package methodRef;

import java.util.function.Function;
import java.util.function.Supplier;

/*
 * method reference by using new
 */
public class MethodReferenceDemoD {
	
	String x;
	
	public MethodReferenceDemoD() {
		super();
	}
	
	public MethodReferenceDemoD(String x) {
		super();
		this.x = x;
	}

	void printX() {
		System.out.println(this.x);
	}
	
	private static void createObjectWithInput() {
//		Function<String, MethodReferenceDemoD> factory = s -> new MethodReferenceDemoD(s);
		Function<String, MethodReferenceDemoD> factory = MethodReferenceDemoD::new;
		MethodReferenceDemoD demo = factory.apply("use contructor to input");
		demo.printX();
	}
	
	private static void createObjectWithoutInput() {
//		Supplier<MethodReferenceDemoD> supplier = () -> new MethodReferenceDemoD();
		Supplier<MethodReferenceDemoD> supplier = MethodReferenceDemoD::new;
		MethodReferenceDemoD demo = supplier.get();
		demo.printX();
	}
	
	public static void main(String[] args) {
		createObjectWithInput();
		createObjectWithoutInput();
	}

}
