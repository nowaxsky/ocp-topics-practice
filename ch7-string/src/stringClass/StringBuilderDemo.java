package stringClass;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		//initialize capacity
		StringBuilder sb = new StringBuilder(500);
		sb.append(", the child cried and cried.\n");
		sb.insert(0, "It was a dark and stormy night");
		sb.append("He cried...\n").append("[ ");
		for(int i = 1; i < 11; i++) {
			sb.append(i).append(" ");
		}
		sb.append("] times");
		System.out.println(sb.toString());
		
		//clear all
		sb.delete(0, sb.length());
		System.out.println("after clean, sb length: " + sb.length());
	}
}
