package advancedEnum;

public enum AdvancedPowerState {

	//every item is actually an object instance
	//has properties: public + static + final
	
	//so enum is another implementation of singleton design pattern
	
	//see SimulatePowerState
	OFF("the power is off"),
	ON("the power is on"),
	SUSPEND("the power is low");
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//have to use private, cannot build it beyond this enum (default is also private)
	private AdvancedPowerState(String description) {
		this.description = description;
	}
	
}
