package nestedClass;

public class Car {

	private boolean running = false;
	private InnerEngine engine = new InnerEngine();
	
	private class InnerEngine {
		
		//inner class can access the private field in the outer class
		public void start() {
			running = true;
		}
	}
	
	public void start() {
		engine.start();
	}
}
