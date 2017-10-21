package multiInterfaces;

public class Boy extends Father implements Skill_1 {

	//we cannot use Father's method makeMoney() to implement Skill_1 owing to modifier is different
	@Override
	public void makeMoney() {
		super.makeMoney();
	}
}
