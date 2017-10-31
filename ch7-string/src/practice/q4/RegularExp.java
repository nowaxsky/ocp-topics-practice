package practice.q4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		String s = "Java 8, Java 7";
		Pattern p1 = Pattern.compile("Java.+?");
		Matcher m1 = p1.matcher(s);
		while(m1.find()) System.out.println(m1.group());
		
		Pattern p2 = Pattern.compile("Java.+");
		Matcher m2 = p2.matcher(s);
		while(m2.find()) System.out.println(m2.group());
		
		Pattern p3 = Pattern.compile("Java.+\\d");
		Matcher m3 = p3.matcher(s);
		while(m3.find()) System.out.println(m3.group());

	}

}
