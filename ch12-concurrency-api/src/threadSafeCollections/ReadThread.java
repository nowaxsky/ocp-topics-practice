package threadSafeCollections;

import java.util.Iterator;
import java.util.List;

public class ReadThread extends Thread {

	private List<Integer> list;
	 
    public ReadThread(String name, List<Integer> list) {
        this.list = list;
        super.setName(name);
    }

    @Override
    public void run() {
 
        while (true) {
 
            String output = "\n" + super.getName() + ":";
 
            Iterator<Integer> iterator = list.iterator();
 
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                output += " " + next;
 
                // fake processing time
                try {
 
                    Thread.sleep(10);
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
 
            System.out.println(output);
        }
    }
}
