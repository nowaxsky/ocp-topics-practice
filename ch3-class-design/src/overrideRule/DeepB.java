package overrideRule;

import java.io.FileNotFoundException;

public class DeepB extends Deeper {

	//you can use same exception class(IOException) or its child class(FileNotFoundException...)
	//or you can throw nothing like DeepA
	@Override
	public Integer getDepth(Number n) throws FileNotFoundException{
		return 5;
	}
}
