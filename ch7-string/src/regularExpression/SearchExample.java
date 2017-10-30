package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchExample {

	private static void searchByPattern() {
		Pattern pattern = Pattern.compile("new");
		String string = "It is a good news";
		Matcher matcher = pattern.matcher(string);
		System.out.println(matcher.find());
	}
	
	private static void searchByString() {
		String string = "It is a good news";
		System.out.println(string.contains("new"));
		System.out.println(string.indexOf("new") > -1 ? true : false);
	}
	
	public static void main(String[] args) {
		searchByPattern();
		System.out.println("-----");
		searchByString();
	}

}
