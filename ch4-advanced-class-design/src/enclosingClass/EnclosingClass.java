package enclosingClass;

public class EnclosingClass {

	private int privateField = 101;
	
	//anonymous member class
	public Object object = new Object() {
		
		@Override
		public String toString() {
			return "anonymous class as field (object member)";
		}
	};
	
	//member class
	class MemberInner {
		public void run() {
			System.out.println("member class: " + privateField);
		}
	}
	
	//static nested class
	static class StaticNestedClass {
		public void run() {
			System.out.println("static nested class");
		}
	}
	
	public void test1() {
		
		//anonymous local class
		Object object = new Object() {
			@Override
			public String toString() {
				return "anonymous class as local variable";
			}		
		};
		
		System.out.println(object);
		System.out.println(this.object);
	}
	
	public void test2() {
		
		//local class
		class LocalInner {
			public void run(String s) {
				System.out.println(s);
			}
		}
		
		new LocalInner().run("local classes: " + privateField);
	}
	
	public static void main(String[] args) {
		EnclosingClass outer = new EnclosingClass();
		outer.test1();
		outer.test2();
		
		//IMPORTANT!!! care for "new" position
		//initialize inner class
		MemberInner inner = outer.new MemberInner();
		inner.run();
		
		//initialize static nested class
		StaticNestedClass staticNestedClass = new EnclosingClass.StaticNestedClass();
		staticNestedClass.run();

	}

}
