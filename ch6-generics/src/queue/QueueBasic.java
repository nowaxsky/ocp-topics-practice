package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Queue is an interface
 * Deque is an interface extending Queue
 * 
 * ArrayQueue implements Deque
 * @author CPM
 *
 */
public class QueueBasic {

	/*
	 * Stack
	 * FILO
	 * use push and pop
	 */
	private static void testStack(Deque<String> stack) {
		stack.push("one");
		stack.push("two");
		stack.push("three");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}	
	 
	/*
	 * Queue
	 * FIFO
	 * use add and remove
	 */
	private static void testQueue(Deque<String> queue) {
		queue.add("one");
		queue.add("two");
		queue.add("three");
		
		int size = queue.size();
		for(int i = 0; i < size; i++) {
			System.out.println(queue.remove());
		}
		
	}
	
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		System.out.println("---stack out---");	
		testStack(deque);
		System.out.println("---queue out---");	
		testQueue(deque);
		
	}

}
