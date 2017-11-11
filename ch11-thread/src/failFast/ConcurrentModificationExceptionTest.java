package failFast;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * following example prove the ConcurrentModificationException not just happen in multi-thread
 */
public class ConcurrentModificationExceptionTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		//fail-fast 1
		try {
			Iterator<Integer> iter = map.keySet().iterator();
			while(iter.hasNext()) {
				Integer key = iter.next();
				if(key >= 2) {
					map.remove(key);
				}
			}
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}
		
		//fail-fast 2
		try {
			for(Integer key: map.keySet()) {
				if(key >= 0) {
					map.remove(key);
				}
			}
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}

	}

}
