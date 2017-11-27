package interfaceDefault;

public abstract class RockParent {
	public abstract String getName();
	public void show() {
		System.out.println(this.getName() + "\t" + "----------------------");
	}
}
