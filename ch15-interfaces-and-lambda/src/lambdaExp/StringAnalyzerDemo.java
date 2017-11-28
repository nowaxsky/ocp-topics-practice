package lambdaExp;

public class StringAnalyzerDemo {
	
	private static void test1() {
		String[] strArr = {"abc", "bcd", "efg"};
		searchArr(strArr, "b", new ContainsAnalyzer());
	}
	
	private static void test2() {
		String[] strArr = {"abc", "bcd", "efg"};
		searchArr(strArr, "b", new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String keyStr) {
				return target.contains(keyStr);
			}
		});
	}
	
	private static void test3() {
		String[] strArr = {"abc", "bcd", "efg"};
		searchArr(strArr, "b", (t, s) -> t.contains(s));
	}
	
	private static void test4() {
		String[] strArr = {"abc", "bcd", "efg"};
		searchArr(strArr, "b", (t, s) -> t.contains(s));
		searchArr(strArr, "b", (t, s) -> t.startsWith(s));
		searchArr(strArr, "b", (t, s) -> t.endsWith(s));
	}
	
	private static void test5() {
		String[] strArr = {"abc", "bcd", "efg"};
		
		StringAnalyzer sa1 = (t, s) -> t.contains(s);
		StringAnalyzer sa2 = (t, s) -> t.startsWith(s);
		StringAnalyzer sa3 = (t, s) -> t.endsWith(s);
		
		searchArr(strArr, "b", sa1);
		searchArr(strArr, "b", sa2);
		searchArr(strArr, "b", sa3);
	}
	
	private static void searchArr(String[] strArr, String keyStr, StringAnalyzer analyzer) {
		for(String str: strArr) {
			if(analyzer.analyze(str, keyStr)) {
				System.out.println(str);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("========== normal way");
		test1();
		System.out.println("========== anonymous class");
		test2();
		System.out.println("========== lambda");
		test3();
		System.out.println("========== lambda for different implementation");
		test4();
		System.out.println("========== lambda used in variable");
		test5();
		
	}
	
	

}
