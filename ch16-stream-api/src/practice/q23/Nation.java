package practice.q23;

public class Nation {

	public enum Land {
		ASIA, EUROPE;
	}
	
	String name;
	Land land;
	public Nation(String name, Land land) {
		super();
		this.name = name;
		this.land = land;
	}
	public String getName() {
		return name;
	}
	public Land getLand() {
		return land;
	}
	
}
