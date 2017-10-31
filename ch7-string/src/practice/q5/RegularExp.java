package practice.q5;

import java.util.Scanner;

public class RegularExp {

	public static void main(String[] args) {
		String input = "Pastel,*Enamel,Fersco,*Gouache";
		Scanner s = new Scanner(input);
		s.useDelimiter(",\\s*");
		while(s.hasNext()) System.out.println(s.next());
		s.close();

	}

}
