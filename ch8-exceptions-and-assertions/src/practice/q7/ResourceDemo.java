package practice.q7;

public class ResourceDemo {

	public static void main(String[] args) {
		try(Resource r = new Resource()) {
			r.work();
		} catch (Exception e) {
			System.out.println("Catch an exception: " + e.getClass());
		} finally {
			System.out.println("Finally block...");
		}

	}

}
