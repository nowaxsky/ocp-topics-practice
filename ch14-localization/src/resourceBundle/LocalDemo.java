package resourceBundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {

	public static void main(String[] args) {
		Locale usLocale = Locale.US;
		Locale frLocale = Locale.FRANCE;
		Locale zhLocale = new Locale("zh", "TW");
		Locale ruLocale = new Locale("ru", "RU");
		Locale defaultLocale = Locale.getDefault();
		
		
		List<Locale> locales = new ArrayList<>();
		locales.add(usLocale);
		locales.add(frLocale);
		locales.add(zhLocale);
		locales.add(ruLocale);
		locales.add(defaultLocale);
		
		for(Locale locale: locales) {
			showLocaleValue(locale, "menu1");
		}

	}
	
	private static void showLocaleValue(Locale locale, String key) {
		System.out.print(locale + "\t");
		ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", locale);
		System.out.println(bundle.getLocale() + ": " + bundle.getString(key));
	}

}
