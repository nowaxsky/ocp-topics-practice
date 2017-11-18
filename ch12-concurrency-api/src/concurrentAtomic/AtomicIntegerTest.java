package concurrentAtomic;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * all classes under concurrent.atomic are thread-safe
 * all method under concurrent.atomic are atomic function(just one step in the function),
 * if method just one step, there are no any thread-safe problem
 * 
 * i++ still not an atomic function
 */
public class AtomicIntegerTest {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(5);
		
		//if ai is 5, replace it with 42
		if(ai.compareAndSet(5, 42)) {
			System.out.println("after compareAndSet(): " + ai);
		}
		
		//ai plus 1
		ai.getAndIncrement();
		System.out.println("after getAndIncrement(): " + ai);

	}

}
