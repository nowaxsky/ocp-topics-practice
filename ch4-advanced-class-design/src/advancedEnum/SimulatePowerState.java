package advancedEnum;

public class SimulatePowerState {

	//simulate enum behavior
	public static final SimulatePowerState OFF = new SimulatePowerState("the power is off");
	public static final SimulatePowerState ON = new SimulatePowerState("the power is on");
	public static final SimulatePowerState SUSPEND = new SimulatePowerState("the power is low");
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private SimulatePowerState(String description) {
		super();
		this.description = description;
	}
	
}
