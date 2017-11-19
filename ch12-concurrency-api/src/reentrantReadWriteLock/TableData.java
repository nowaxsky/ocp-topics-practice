package reentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TableData {

	private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	
	static void sleep(int secs) {
		try {
			Thread.sleep(1000 * secs);
		} catch (Exception e) {}
	}
	
	public void update() {
		rwl.writeLock().lock();
		System.out.println("===updating=== holding write lock");
		sleep(3);
		rwl.writeLock().unlock();
		System.out.println("===updated=== released write lock");
	}
	
	public void delete() {
		rwl.writeLock().lock();
		System.out.println("===deleting=== holding write lock");
		sleep(3);
		rwl.writeLock().unlock();
		System.out.println("===deleted=== released write lock");
	}
	
	public void query() {
		rwl.readLock().lock();
		System.out.println("===querying=== holding read lock");
		sleep(3);
		rwl.readLock().unlock();
		System.out.println("===queried=== released read lock");
	}
}
