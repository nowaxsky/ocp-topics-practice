package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharSearch {

	public static void main(String[] args) {
		String t = "John told me 10 ways to zoo in 20 minutes.";
		
		Pattern p1 = Pattern.compile("\\d\\d");
		Matcher m1 = p1.matcher(t);
		while(m1.find()) System.out.println("found p1: " + m1.group());
		
		Pattern p2 = Pattern.compile("\\sin\\s");
		Matcher m2 = p2.matcher(t);
		while(m2.find()) System.out.println("found p2: '" + m2.group() + "'");
		
		Pattern p3 = Pattern.compile("\\Sin\\S");
		Matcher m3 = p3.matcher(t);
		while(m3.find()) System.out.println("found p3: " + m3.group());

	}

}
