package wildcardsInGenerics;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class WildcardTest {

	public static void main(String[] args) {
		List<A> listA = new ArrayList<A>();
		listA.add(new A());
		listA.add(new B());
		listA.add(new C());
		List<B> listB = new ArrayList<B>();
		listA.add(new B());

		List<?> listUknown0 = new ArrayList<A>();

		List<? extends A> listUknown1 = new ArrayList<A>();
		List<? extends A> listUknown2 = new ArrayList<B>();

		List<? super A> listUknown3 = new ArrayList<SuperA>(); 		
		List<? super A> listUknown4 = new ArrayList<A>(); 
		// List<? super A> listUknown5 = new ArrayList<B>();
	}

	private static void processElements(List<?> elements) {
		// elements.add(new A());		// compile error!
		// elements.add(new B());		// compile error!
		// elements.add(new C());		// compile error!
		// elements.add(new Object());	// compile error!
		for (Object o : elements) {
			System.out.println(o);
		}
	}
	private static void testProcessElements() {
		List<A> listA = new ArrayList<A>();
		processElements(listA);
		List<B> listB = new ArrayList<B>();
		processElements(listA);
		List<C> listC = new ArrayList<C>();
		processElements(listA);
	}

	private static void processExtendsElements(List<? extends A> list) {
		// elements.add(new A());		// compile error!
		// elements.add(new B());		// compile error!
		// elements.add(new C());		// compile error!
		// elements.add(new Object());	// compile error!
		for (A a : list) {
			System.out.println(a.getClass().getName());
		}
	}
	private static void testProcessExtendsElements() {
		List<A> listA = new ArrayList<A>();
		processExtendsElements(listA);

		List<B> listB = new ArrayList<B>();
		processExtendsElements(listB);

		List<C> listC = new ArrayList<C>();
		processExtendsElements(listC);
	}

	public static void insertElements(List<? super A> list) {
		list.add(new A());
		list.add(new B());
		list.add(new C());
		/* compile error! 
		for (A a : list) {	
			System.out.println(a.getClass().getName());
		}*/
		Object object = list.get(0);
	}

	private static void testInsertElements() {
		List<A> listA = new ArrayList<A>();
		insertElements(listA);
		
		List<SuperA> listAA = new ArrayList<SuperA>();
		insertElements(listAA);

		List<Object> listObject = new ArrayList<Object>();
		insertElements(listObject);
	}
}
