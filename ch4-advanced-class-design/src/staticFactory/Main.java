package staticFactory;

public class Main {

	public static TV getInstance(String brand) {
		if(brand.equals("APPLE")) {
			return new AppleTV();
		} else if(brand.equals("SONY")) {
			return new SonyTV();
		} else {
			return null;
		}
	}
	
	public static void main(String args[]) {
		
		//use constructor to build object
		TV sony = new SonyTV();
		sony.play();
		
		//use static factory method design pattern to build object
		TV apple = Main.getInstance("APPLE");
		apple.play();
	}
}
