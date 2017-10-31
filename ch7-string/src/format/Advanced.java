package format;

import java.io.PrintWriter;

public class Advanced {

	public static void main(String[] args) {
		double price = 99.99;
		int quantity = 4;
		String color = "red";
		
		System.out.printf("# %02d %s %3.2f #\n", quantity, color, price);
		System.out.format("# %02d %s %3.2f #\n", quantity, color, price);
		
		String out = String.format("# %02d %s %3.2f #", quantity, color, price);
		System.out.println(out);
		
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.printf("# %02d %s %3.2f #\n", quantity, color, price);

	}

}
