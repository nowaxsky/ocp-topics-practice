package enumType;

public class NewMethodTest {

	public static void main(String[] args) {
		NewMethod n = new NewMethod();
		n.setState(PowerState.ON);
		System.out.println("state 0: " + n.getState());
		System.out.println("ordinal: " + n.getState().ordinal());
		
		n.setState(PowerState.SUSPEND);
		System.out.println("state 1: " + n.getState());
		System.out.println("ordinal: " + n.getState().ordinal());
		
		n.setState(PowerState.OFF);
		System.out.println("state 2: " + n.getState());
		System.out.println("ordinal: " + n.getState().ordinal());
		
		//compile error
//		n.setState(30);
		
	}
}
