package practice.q4;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		fly(() -> new Bird());
		fly(Rooster::new);

	}
	
	/**
	//compile error
	private static void fly(Consumer<Bird> bird) {
		bird::new;
	}
	
	//compile error
	private static void fly(Consumer<? extends Bird> bird) {
		bird.accept().fly();
	}
	 */
	
	private static void fly(Supplier<Bird> bird) {
		bird.get().fly();
	}
	
	

}
