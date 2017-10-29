package practice.q17;

public class MyFoo<K, V> {

	private K key;
	private V value;
	
	private MyFoo(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public static <T> MyFoo<T, T> twice(T value) {
		return new MyFoo<T, T>(value, value);
	}
	
	public static void main(String[] args) {
		MyFoo<String, Integer> optionA = new MyFoo<String, Integer>("Duke", 10);
		MyFoo<String, String> optionB = MyFoo.twice("Duke");
		MyFoo<String, String> optionC = MyFoo.<String> twice("Duke");
		MyFoo<? extends Object, ? extends Object> optionD = new MyFoo<String, Integer>("Duke", 32);
		MyFoo<String, String> optionE = new MyFoo<>("Duke", "Java");
	}
	
}
