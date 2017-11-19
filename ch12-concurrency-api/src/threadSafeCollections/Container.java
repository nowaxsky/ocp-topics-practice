package threadSafeCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Container {

	//try following containers
	static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//	static List<Integer> list = new ArrayList<>();
	
	public static void addItem(int i) {
		list.add(i);
	}
	
	public static void showItem(int i) {
		System.out.println(list.get(i));
	}
}
