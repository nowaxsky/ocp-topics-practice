package practice.q14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/myDB";
		String username = "root";
		String password = "sa";
		String query = "SELECT * FROM EMPLOYEE";
		
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(query)) {
			
			while(rs.next()) {
				if(rs.getInt(1) == 2) {
					rs.updateString(2, "XXX");
//					rs.updateRow();
//					rs.updateString(2, "Chung");
//					rs.updateRow();
				}
			}
			rs.absolute(2);
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
