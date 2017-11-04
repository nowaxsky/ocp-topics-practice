package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -355478252451222093L;
	
	private List<Shirt> shirts = new ArrayList<>();
	static int staticField = 100;
	transient int transientField = 100;
	
	public Order(Shirt... shirts) {
		for(Shirt s: shirts) {
			this.shirts.add(s);
		}
		staticField = 99;
		transientField = 99;
		System.out.println("--- Contructor is launched ---");
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		
		Date now = new Date();
		oos.writeObject(now);
		System.out.println("Serialized at: " + now);
	}
	
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject();
		System.out.println("Restored from data: " + (Date) ois.readObject());
		System.out.println("Restored at: " + new Date());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Order Summary ===\n");
		for(Shirt s: shirts) {
			sb.append(s);
		}
		sb.append("staticField = " + staticField);
		sb.append("\ntransientField = " + transientField);
		sb.append("\n--------------");
		return sb.toString();
	}
}
