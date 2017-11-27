package practice.q11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("zzzz", Locale.US);
		System.out.println(sdf.format(new Date()));

	}

}
