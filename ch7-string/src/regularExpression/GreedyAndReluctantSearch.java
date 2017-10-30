package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAndReluctantSearch {

	public static void main(String[] args) {
		String t = "Long longlong ago, in a place far farfar away";
		
		Pattern p1 = Pattern.compile("ago.*");
		Matcher m1 = p1.matcher(t);
		while(m1.find()) System.out.println("found p1: " + m1.group());
		
		Pattern p2 = Pattern.compile("fa.{4}");
		Matcher m2 = p2.matcher(t);
		while(m2.find()) System.out.println("found p2: " + m2.group());		
		
		Pattern p3 = Pattern.compile("(long){2}");
		Matcher m3 = p3.matcher(t);
		while(m3.find()) System.out.println("found p3: " + m3.group());	

		Pattern p4 = Pattern.compile("ago.*far");
		Matcher m4 = p4.matcher(t);
		while(m4.find()) System.out.println("found p4: " + m4.group());

		Pattern p5 = Pattern.compile("ago.*?far");
		Matcher m5 = p5.matcher(t);
		while(m5.find()) System.out.println("found p5: " + m5.group());
		
	}

}
