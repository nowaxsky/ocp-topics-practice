package practice.q1;

public class Split {

	public static void main(String[] args) {
		String names = "John-.-George-.-Paul-.-Jim";
		
		
		String[] arr = names.split("-..");
		for(String s: arr) {
			System.out.println(s);
		}
	}

}
