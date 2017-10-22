package enumType;

public class OldMethodTest {

	public static void main(String[] args) {
		OldMethod o = new OldMethod();
		o.setState(OldMethod.POWER_ON);
		System.out.println("state 0: " + o.getState());
		
		o.setState(OldMethod.POWER_SUSPEND);
		System.out.println("state 1: " + o.getState());
		
		o.setState(0);
		System.out.println("state 2: " + o.getState());
		
		o.setState(30);
		System.out.println("state 3: " + o.getState());
	}

}
