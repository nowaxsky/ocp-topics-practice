package enumImport;

import static enumImport.PowerState.*;

public class EnumImport {

	public static void main(String[] args) {
		Machine machine = new Machine();
		
		machine.setState(ON);
		System.out.println(getDescription(SUSPEND));
		
		//Exception in thread "main" java.lang.NullPointerException
//		System.out.println(getDescription(null));

	}

	private static String getDescription(PowerState state) {
		switch (state) {
		case OFF:	
			return "power off";
		case ON:
			return "power on";
		case SUSPEND:
			return "power is low";
		default:
			return "unknown state";
		}
	}
}
