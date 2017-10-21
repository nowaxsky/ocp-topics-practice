package varargs;

public class Main {

	public static void main(String[] args) {
		Statistics s = new Statistics();
		System.out.println(s.average());
		System.out.println(s.average(0,9));
		System.out.println(s.average(1,1,2,3,5,8,13,21));
		System.out.println(s.average(1,2));
		
		int[] arr = {50,100,150,200};
		System.out.println(s.average(arr));

	}

}
