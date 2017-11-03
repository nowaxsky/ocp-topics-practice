package assertions;

public class AssertionDemo {

	private static void internal(int x) {
		if(x > 0) {
			System.out.println("x > 0");
		} else {
			
			//if x is not bigger than 0, x must be 0
			assert(x == 0);
		}
	}
	
	private static void controlFlow(String gender) {
		switch (gender) {
		case "MALE":
			System.out.println(gender);
			break;
		case "FEMALE":
			System.out.println(gender);
			break;
		default:
			assert false: "Unknown gender!!";
			break;
		}
	}
	
	//open Run Configurations -> tag Arguments -> write -ea(or -enableassertions) in VM arguments
	public static void main(String[] args) {
		internal(1);
		controlFlow("female");
		ClassInvariant ci = new ClassInvariant(60, 100, 100);
		ci.rule();
	}

}
