package threadSafeCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * This program demonstrates how CopyOnWriteArrayList works.
 * 
 * @author www.codejava.net
 *
 */
public class ThreadSafeDemo2 {

	public static void main(String[] args) {
		
		//try following lists and see what happens?
//		List<Integer> list = new CopyOnWriteArrayList<>();
		List<Integer> list = new ArrayList<>();
 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
 
        new WriteThread("Writer", list).start();
 
        new ReadThread("Reader", list).start();
 
    }

}
