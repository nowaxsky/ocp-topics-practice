import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeStoredProcedure {

	public static void countSalary(float salary, int[] count) throws SQLException {
		String url = "jdbc:default:connection";
		Connection con = DriverManager.getConnection(url);
		String query = "SELECT COUNT(*) AS count FROM Employee WHERE Salary > ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setFloat(1, salary);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			count[0] = rs.getInt(1);
		} else {
			count[0] = 0;
		}
		con.close();
	}
	
	public static void countAge(Date birthDay, int[] count) throws SQLException {
		String url = "jdbc:default:connection";
		Connection con = DriverManager.getConnection(url);
		String query = "SELECT COUNT(*) AS count FROM Employee WHERE Birthdate <= ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setDate(1, birthDay);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			count[0] = rs.getInt(1);
		} else {
			count[0] = 0;
		}
		con.close();
	}
}
