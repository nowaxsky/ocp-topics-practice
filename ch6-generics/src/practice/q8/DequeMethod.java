package practice.q8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMethod {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("one");
		deque.addFirst("two");
		deque.addFirst("three");
		
		for(String s: deque) {
			System.out.println(s);
		}
		
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());

	}

}
