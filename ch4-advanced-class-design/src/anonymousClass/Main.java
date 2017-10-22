package anonymousClass;

public class Main {

	//two way to build instance of anonymous class 
	
	Super s1 = new Sub();
	Super s2 = new Super() {
		
		//by super class
		@Override
		void doIt() {
			System.out.println("this is an anonymous super class");
		}
	};
	
	Interface i1 = new InterfaceImpl();
	Interface i2 = new Interface() {
		
		//by interface
		@Override
		public void doIt() {
			System.out.println("this is an anonymous interface class");
		}
	};
	
	public static void main(String[] args) {
		Main m = new Main();
		m.s1.doIt();
		m.s2.doIt();
		m.i1.doIt();
		m.i2.doIt();

	}

}
