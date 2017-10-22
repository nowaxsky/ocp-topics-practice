package singleton;

public class SingletonClass {

	//must be private constructor to prevent from using "new" build it 
	private SingletonClass() {}
	
	//use static to build one class, and use final to point fixed ref
	private static final SingletonClass instance = new SingletonClass();
	
	//getter
	public static SingletonClass getInstance() {
		return instance;
	}
}
