package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List is an interface
 * 
 * ArrayList and LinkedList implement List
 * 
 * @author CPM
 *
 */
public class ListBasic {

	private static void list() {
		List<Integer> list = new ArrayList<>(6);
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		
		Iterator<Integer> elements = list.iterator();
		while(elements.hasNext()) {
			Integer partNumberObject = elements.next();
			int partNumber = partNumberObject.intValue();
			
			/*
			 * boxing: basic type -> class
			 * unboxing: class -> basic type
			 * unboxing can be executed auto like so
			 */
			int unboxing = elements.next();
			
			System.out.println("part number: " + partNumber);
			System.out.println("unboxing machanism: " + unboxing);
		}
	}
	
	public static void main(String[] args) {
		list();
	}
	
}
