package enumType;

public class OldMethod {

	public static final int POWER_OFF = 0;
	public static final int POWER_ON = 1;
	public static final int POWER_SUSPEND = 2;
	
	private int state;
	
	public void setState(int state) {
		if(state == 0 || state == 1 || state == 2) {
			this.state = state;
		}
	}
	
	public int getState() {
		return state;
	}
}
