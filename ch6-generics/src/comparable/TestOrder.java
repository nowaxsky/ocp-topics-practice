package comparable;

import java.util.Calendar;

public class TestOrder {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar tomorrow = Calendar.getInstance();
		
		//compareTo() or compare() will return a number to compare order
		tomorrow.add(Calendar.DATE, 1);
		System.out.println(today.compareTo(tomorrow));
		System.out.println("A".compareTo("D"));
		System.out.println(new Integer(10).compareTo(new Integer(10)));

	}

}
