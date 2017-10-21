package multiInterfaces;

public class Child implements Skill_1, Skill_2 {

	//we can implement 2 interfaces at the same time
	@Override
	public void makeMoney() {
		System.out.println("make money");
		
	}

}
