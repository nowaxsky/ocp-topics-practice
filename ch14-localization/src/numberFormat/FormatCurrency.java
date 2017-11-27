package numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatCurrency {

	public static void main(String[] args) {
		NumberFormat numberFormat = null;
		numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Locale.US: " + numberFormat.format(1_000_000));
		
		numberFormat = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		System.out.println("Locale.TAIWAN: " + numberFormat.format(1_000_000.00));
		
		numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println("Locale.JAPAN: " + numberFormat.format(1_000_000.00));
	}

}
