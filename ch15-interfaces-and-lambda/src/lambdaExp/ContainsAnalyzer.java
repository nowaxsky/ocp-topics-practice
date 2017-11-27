package lambdaExp;

public class ContainsAnalyzer implements StringAnalyzer {

	@Override
	public boolean analyze(String target, String keyStr) {
		return target.contains(keyStr);
	}

}
