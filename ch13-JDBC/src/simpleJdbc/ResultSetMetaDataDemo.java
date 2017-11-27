package simpleJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;


public class ResultSetMetaDataDemo {

	private static void showResultSetMetaData(ResultSet rs) throws SQLException {
		
		int numCols = rs.getMetaData().getColumnCount();
		String[] colNames = new String[numCols];
		String[] colTypes = new String[numCols];
		
		for(int i = 0; i < numCols; i++) {
			
			//columns from database start from 1
			colNames[i] = rs.getMetaData().getColumnName(i + 1);
			colTypes[i] = rs.getMetaData().getColumnTypeName(i + 1);
		}
		
		System.out.println("Number of columes returned: " + numCols);
		System.out.println("Colume names/types returned:\n");
		
		for(int i = 0; i < numCols; i++) {
			System.out.println(colNames[i] + " : " + colTypes[i]);
		}
	}
	
	private static int rowCountByCursor(ResultSet rs) throws SQLException {
		
		int rowCount = 0;
		int currRow = rs.getRow();
		
		if(!rs.last()) return -1;
		rowCount = rs.getRow();
		
		if(currRow == 0) rs.beforeFirst();
		else rs.absolute(currRow);
		
		return rowCount;
	}
	
	private static int rowCountBySQL(Connection con, String money) throws SQLException {
		String query = "SELECT COUNT(*) FROM Employee WHERE Salary > " + money;
		try(Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			rs.next();
			int count = rs.getInt(1);
			return count;
		} 
	}
	
	private static void printResultSet(ResultSet rs) throws SQLException {
		while (rs.next()) {
			int empID = rs.getInt("ID");
			String first = rs.getString("FirstName");
			String last = rs.getString("LastName");
			Date birthDate = rs.getDate("BirthDate");
			float salary = rs.getFloat("Salary");
			System.out.println("Employee ID: " + empID + "\t"
					+ "Employee Name: " + first + " " + last + "\t"
					+ "Birth Date: " + birthDate + "\t" + "Salary: " + salary);
		} 
	}
	
	private static void runPreparedStatement(Connection con, double value) throws SQLException {
		String query = "SELECT * FROM Employee WHERE Salary > ?";
		PreparedStatement pStmt = con.prepareStatement(query);
		pStmt.setDouble(1, value);
		ResultSet rs = pStmt.executeQuery();
		printResultSet(rs);
	}
	
	private static void runSqlInjection(Connection con, String value) throws SQLException {
		String query = "SELECT * FROM Employee WHERE Salary > " + value;
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		printResultSet(rs);
	}
	
	private static void runCallableStatement(Connection con, Float salary) throws SQLException {
		CallableStatement cStmt = con.prepareCall("{CALL EMP_SALARY_COUNT(?, ?)}");
		cStmt.setFloat(1, salary);
		cStmt.registerOutParameter(2, Types.INTEGER);
		boolean result = cStmt.execute();
		int count = cStmt.getInt(2);
		System.out.println("Result: " + result);
		System.out.println("There are " + count + " Employees over the salary of " + salary);
		
	}
	
	
	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/myDB";
		String username = "root";
		String password = "sa";
		String money = "50000";
		String query = "SELECT * FROM Employee WHERE Salary > " + money;
		
		try(Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(query)) {
//			showDatabaseMetaData(con);
			System.out.println("------------------------------------");
			showResultSetMetaData(rs);
			System.out.println("------------------------------------");
			System.out.println("Row Count: " + rowCountByCursor(rs));
			System.out.println("------------------------------------");
			System.out.println("Row Count: " + rowCountBySQL(con, money));
			System.out.println("------------------------------------");
			printResultSet(rs);
//			System.out.println("------------------------------------ runCallableStatement()");
//			runCallableStatement(con);
			System.out.println("------------------------------------ runCallableStatement()");
			runCallableStatement(con, Float.valueOf(money));
			System.out.println("------------------------------------ runPreparedStatement()");
			runPreparedStatement(con, Double.valueOf(money));
			System.out.println("------------------------------------ runSqlInjection()");
			runSqlInjection(con, money + " or 1=1");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
