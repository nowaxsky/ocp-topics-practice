package dateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDate {

	private static void useDateFormat() {
		System.out.println("========== UseDateFormat() ==========");
		Date today = new Date();
		Locale locale = Locale.US;
		DateFormat df = null;
		
		df = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		System.out.println("DateFormat.DEFAULT:\t" + df.format(today));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		System.out.println("DateFormat.SHORT:\t" + df.format(today));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		System.out.println("DateFormat.MEDIUM:\t" + df.format(today));
		
		df = DateFormat.getDateInstance(DateFormat.LONG, locale);
		System.out.println("DateFormat.LONG:\t" + df.format(today));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println("DateFormat.FULL:\t" + df.format(today));
	}
	
	private static void useSimpleDateFormat() {
		System.out.println("========== UseSimpleDateFormat() ==========");
		Date today = new Date();
		Locale locale = Locale.US;
		DateFormat df = null;
		
		df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
		System.out.println(df.format(today));
		
		df = new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss", locale);
		System.out.println(df.format(today));
		
		df = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss", locale);
		System.out.println(df.format(today));
	}
	
	
	public static void main(String[] args) {
		useDateFormat();
		useSimpleDateFormat();
	}

}
