package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupConcept {

	public static void main(String[] args) {
		String email = "jim.tzeng@xxx.com";
		Pattern p1 = Pattern.compile("(\\S+?)\\.(\\S+?)@(\\S+?)");
		Matcher m1 = p1.matcher(email);
		
		if(m1.find()) {
			System.out.println("p1 group1: " + m1.group(1));
			System.out.println("p1 group1: " + m1.group(2));
			System.out.println("p1 group1: " + m1.group(3));
			System.out.println("p1 matched all: " + m1.group());
			System.out.println("p1 matched all: " + m1.group(0));
		}
		
		System.out.println("-----");
		Pattern p2 = Pattern.compile("(\\S+?)\\.(\\S+?)@(\\S+)");
		Matcher m2 = p2.matcher(email);
		
		if(m2.find()) {
			System.out.println("p2 group2: " + m2.group(1));
			System.out.println("p2 group2: " + m2.group(2));
			System.out.println("p2 group2: " + m2.group(3));
			System.out.println("p2 matched all: " + m2.group());
			System.out.println("p2 matched all: " + m2.group(0));			
		}

	}

}
