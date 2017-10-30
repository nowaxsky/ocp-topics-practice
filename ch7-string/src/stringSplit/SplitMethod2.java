package stringSplit;

import java.util.StringTokenizer;

public class SplitMethod2 {

	public static void main(String[] args) {
		String shirts = "1st Shirt, 2nd Shirt, 3rd Shirt, 4th Shirt";
		StringTokenizer st = new StringTokenizer(shirts, ", ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken() + "@");
		}

	}

}
