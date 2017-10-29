package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set is an interface
 * SortedSet is an interface extending Set
 * 
 * HashSet implements Set
 * TreeSet implements SortedSet
 * 
 * @author CPM
 *
 */
public class SetBasic {

	private static void hashSet() {
		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		
		//invalid, nut no error
		set.add("three");
		for(String item: set) {
			System.out.println("Item: " + item);
		}
		
	}
	
	private static void treeSet() {
		Set<String> set = new TreeSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		
		//invalid, nut no error
		set.add("three");
		for(String item: set) {
			System.out.println("Item: " + item);
		}
		
	}
	
	public static void main(String[] args) {
		hashSet();
		treeSet();
	}
}
