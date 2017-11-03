package practice.q17;

public class Main {

	public static void main(String[] args) {
		try(Scanner ir = new Scanner(); Printer iw = new Printer()) {
			ir.scan();
			iw.print();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
