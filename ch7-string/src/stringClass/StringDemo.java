package stringClass;

import java.io.PrintWriter;

public class StringDemo {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		String s1 = "It was the best of times";
		String s2 = "It was the worst of times";
		if(s1.equals(s2)) {
			pw.println("Strings match...");
		}
		if(s1.contains("It was")) {
			pw.println("It was found");
		}
		
		s2.replace("t", "@");
		pw.println(s2);
		s2 = s2.replace("t", "@");
		pw.println(s2);
		pw.println(s2.substring(5, 12));

	}

}
