package suppressedExceptions;

public class SuppressedExceptions {

	public static void main(String[] args) {
		before7();
		after7();
	}
	
	@SuppressWarnings("finally")
	private static void before7() {
		try {
			try {
				throw new TryException();	//this is lost
			} finally {
				throw new FinallyException();
			}
		} catch (Exception e) {
			System.out.println("before7: " + e.getClass());
			System.out.println(e.getSuppressed().length);
		}
		
	}
	
	@SuppressWarnings("finally")
	private static void after7() {
		try {
			Throwable t = null;
			try {
				throw new TryException();			
			} catch (Exception e) {
				System.out.println("catching...");
				t = e;
			} finally {
				FinallyException fe = new FinallyException();
				if(t != null) {
					System.out.println("Throwable is not null");
					t.addSuppressed(fe);
					throw t;
				} else {
					System.out.println("Throwable is null");
					throw fe;
				}
			}
			
		} catch (Throwable e) {
			System.out.println("after7: " + e.getClass());
			System.out.println("find suppressed exceptions:");
			for(Throwable t: e.getSuppressed()) {
				System.out.println("after7: " + t.getClass());
			}
		}
		
	}

}
