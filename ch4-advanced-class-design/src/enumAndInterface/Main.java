package enumAndInterface;

public class Main {

	public static void main(String[] args) {
		System.out.println(AlertablePowerState.OFF.ordinal());
		System.out.println(AlertablePowerState.ON.ordinal());
		System.out.println(AlertablePowerState.SUSPEND.ordinal());
		
		System.out.println(AlertablePowerState.OFF.getDescription());
		System.out.println(AlertablePowerState.ON.getDescription());
		System.out.println(AlertablePowerState.SUSPEND.getDescription());
		
		AlertablePowerState.OFF.setDescription("the power is shutdown");
		
		System.out.println(AlertablePowerState.OFF.getDescription());
		
		AlertablePowerState.OFF.alert();
		AlertablePowerState.ON.alert();
		AlertablePowerState.SUSPEND.alert();

	}

}
