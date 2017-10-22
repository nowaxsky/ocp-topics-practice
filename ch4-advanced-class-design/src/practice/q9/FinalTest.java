package practice.q9;

//compilation succeeds
final class FinalTest {

	final String location;
	FinalTest(final String loc) {
		location = loc;
	}
	
	FinalTest(String loc, String s) {
		location = loc;
		loc = "unknown";
	}
	
}
