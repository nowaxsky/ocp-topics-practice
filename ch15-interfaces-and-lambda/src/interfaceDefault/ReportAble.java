package interfaceDefault;

public interface ReportAble {
	
	public String getName();
	public double getTotalPrice();
	public double getTotalCost();
	public double getProfit();
	
	//you can implement default and static method in the interface
	public default void show() {
		System.out.println(this.getName() +
				"\t" + this.getTotalPrice() + 
				"\t" + this.getTotalCost() + 
				"\t" + this.getTotalPrice());
	}
	
	public static void report (ReportAble item) {
		System.out.println(item.getName() +
				"\t" + item.getTotalPrice() + 
				"\t" + item.getTotalCost() + 
				"\t" + item.getTotalPrice());
	}
}
