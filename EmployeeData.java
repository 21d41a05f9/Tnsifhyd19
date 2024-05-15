package sri.code.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "9603294792";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println(" the database is Connected to the database");
		        conn.close();
		    }
		} catch (SQLException ex) {
			ex.printStackTrace();
		    		

		}
	} 

}
