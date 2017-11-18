package threadSafeCollections;

public class AddThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			Container.addItem(i);
		}
		
	}
}
