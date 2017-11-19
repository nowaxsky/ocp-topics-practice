package failFast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * fail-fast:
 * two threads use removeItem and getSummary respectively in the same time,
 * will cause ConcurrentModificationException
 * 
 * how to avoid?
 * use synchronized at every method
 * 
 */
public class ShopingCart {

	private List<Item> cart = new ArrayList<>();
	
	public synchronized void addItem(Item item) {
		cart.add(item);
	}
	
	public synchronized void removeItem(int index) {
		cart.remove(index);
	}
	
	public String getSummary() {
		StringBuilder note = new StringBuilder();
		
		/*
		 * use synchronized block to prevent lock whole method
		 */
		synchronized (this) {
			Iterator<Item> iter = cart.iterator();
			while(iter.hasNext()) {
				Item item = iter.next();
				note.append("Item: " + item.desc() + "\n");
			}
		}
		
		return note.toString();
	}
}
