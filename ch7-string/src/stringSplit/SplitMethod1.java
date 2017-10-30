package stringSplit;

public class SplitMethod1 {

	public static void main(String[] args) {
		String shirts = "1st Shirt, 2nd Shirt, 3rd Shirt, 4th Shirt";
		String[] results = shirts.split(", ");
		for(String string: results) {
			System.out.println(string);
		}
	}

}
