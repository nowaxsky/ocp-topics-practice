package regularExpression;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsefulRegularExpression {

	public static void main(String[] args) throws IOException {
		
		String htmlTag = "</?[a-z][a-z0-9]*[^<>]*>";
		String ipAddress = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
		String emailAddress = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
		String utlAddress = "http?:\\/\\/[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)";
		
		StringBuilder htmlContent = new StringBuilder();
		Path source = Paths.get("src/regularExpression/PatternsTest.html").toAbsolutePath();
		Charset cs = Charset.forName("BIG5");
		List<String> lines = Files.readAllLines(source, cs);
		for(String s: lines) {
			htmlContent.append(s);
		}
		
		System.out.println("--Found IP--");
		showMatched(htmlContent, ipAddress);
		
		System.out.println("--Found email--");
		showMatched(htmlContent, emailAddress);
		
		System.out.println("--Found url--");
		showMatched(htmlContent, utlAddress);
		
		System.out.println("--Found htmlTag--");
		showMatched(htmlContent, htmlTag);

	}

	private static void showMatched(StringBuilder html, String regularExp) {
		Pattern p = Pattern.compile(regularExp);
		Matcher m = p.matcher(html.toString());
		while(m.find()) System.out.println(m.group());
		System.out.println();
	}

}
