package advancedFunctionalInterfaces;

import java.util.function.DoubleFunction;

public class DoubleFunctionDemo {

	public static void main(String[] args) {
		DoubleFunction<String> calc = t -> String.valueOf(t * 10);
		String result = calc.apply(3.1415926);
		System.out.println("New value is: " + result);

	}

}
