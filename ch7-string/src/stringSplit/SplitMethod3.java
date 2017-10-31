package stringSplit;

import java.util.Scanner;

public class SplitMethod3 {

	public static void main(String[] args) {
		String string = "1.11, 2.22, 3.33";
		double sum = 0;
		Scanner scan = new Scanner(string).useDelimiter(", ");
		try {
			while(scan.hasNextDouble()) {
				double d = scan.nextDouble();
				System.out.println(d);
				sum += d;
			}
			System.out.println("sum: " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
