package polymorphism;

public class AppleTV extends TV implements DVDable {

	public void showHD() {
		System.out.println("AppleTV showHD()");
	}
	
	@Override
	public void changeChannel() {
		System.out.println("AppleTV jumps channels");
	}

	@Override
	public void playDVD() {
		System.out.println("AppleTV playDVD()");		
	}
	

}
