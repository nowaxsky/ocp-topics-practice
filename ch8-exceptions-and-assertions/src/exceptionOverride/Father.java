package exceptionOverride;

import java.io.IOException;
import java.sql.SQLException;

abstract public class Father {

	abstract void m1() throws IOException;
	abstract void m2() throws RuntimeException;
	abstract void m3() throws SQLException;
}
