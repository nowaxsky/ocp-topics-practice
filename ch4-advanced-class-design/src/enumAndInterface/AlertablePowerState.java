package enumAndInterface;

public enum AlertablePowerState implements Alertable {

	OFF("the power is off") {
		
		@Override
		public void alert() {
			System.out.println("OFF alert");
		}
	},
	ON("the power is on"),
	SUSPEND("the power is low");
	
	@Override
	public void alert() {
		System.out.println("default alert");
		
	}
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private AlertablePowerState(String description) {
		this.description = description;
	}

}
