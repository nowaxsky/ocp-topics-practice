package reentrantReadWriteLock;

public class ReadWriteLockDemo {

	static void query(final TableData d) {
		new Thread() {
			@Override
			public void run() {
				d.query();
			}
		}.start();
	}
	
	static void delete(final TableData d) {
		new Thread() {
			@Override
			public void run() {
				d.delete();
			}
		}.start();
	}
	
	static void update(final TableData d) {
		new Thread() {
			@Override
			public void run() {
				d.update();
			}
		}.start();
	}
	
	static void counting() {
		new Thread() {
			@Override
			public void run() {
				int i = 0;
				while(true) {
					TableData.sleep(1);
					System.out.println(i++);
					if(i >= 20) break;
				}
			}
		}.start();
	}
	
	public static void main(String[] args) {
		counting();
		final TableData table = new TableData();
		query(table);
		query(table);
		update(table);
		delete(table);
		query(table);
		query(table);
		update(table);

	}

}
