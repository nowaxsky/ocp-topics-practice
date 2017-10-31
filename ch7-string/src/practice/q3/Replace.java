package practice.q3;

public class Replace {

	public static void main(String[] args) {
		String s = "race cars";
		s.replace(s, "convertibles");
		
		//3$ auto convert
		//1$ can be ignored
		System.out.printf("There are %3$s %2$s and %d trucks.", 6, s, 3+7);

	}

}
