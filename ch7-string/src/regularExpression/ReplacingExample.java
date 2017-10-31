package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacingExample {

	public static void main(String[] args) {
		String s = "<h1>This is an H1</h1>";
		
		Pattern p1 = Pattern.compile("h1");
		Matcher m1 = p1.matcher(s);
		if(m1.find()) {
			System.out.println("p1: " + m1.replaceAll("p"));
		}
		
		Pattern p2 = Pattern.compile("(H|h)1");
		Matcher m2 = p2.matcher(s);
		if(m2.find()) {
			System.out.println("p2: " + m2.replaceAll("p"));
		}

		Pattern p3 = Pattern.compile("H|h1");
		Matcher m3 = p3.matcher(s);
		if(m3.find()) {
			System.out.println("p3: " + m3.replaceAll("p"));
		}
	}

}
