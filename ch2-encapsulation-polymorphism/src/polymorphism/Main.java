package polymorphism;

public class Main {

	public static void main(String[] args) {
		AppleTV x1 = new AppleTV();
		TV x2 = x1;
		DVDable x3 = x1;
		x1.changeChannel();
		x2.changeChannel();
		x1.playDVD();
		x3.playDVD();
		
//		TV tv;
//		tv = new AppleTV();
//		tv = new SonyTV();
//		DVDable dvd;
//		dvd = new AppleTV();
		
		AppleTV appleTV = new AppleTV();
		SonyTV sonyTV = new SonyTV();
		showBasicTvFunctions(appleTV);
		showBasicTvFunctions(sonyTV);
		playDvd(appleTV);
		
	}
	
	public static void showBasicTvFunctions(TV tv) {
		System.out.println("TV features");
		tv.turnOn();
		tv.turnOff();
		tv.changeChannel();
		tv.changeVolume();
	}
	
	public static void playDvd(DVDable dvd) {
		System.out.println("DVDable features");
		dvd.playDVD();
	}

}
