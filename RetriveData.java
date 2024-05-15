package sri.code.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "9603294792";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String empid = result.getString(1);
			    String empname = result.getString(2);
			    String empsalary = result.getString(3);
			    String location = result.getString(4);
			 
			    String output = "employee #%d: %s - %s - %s - %s";
			    System.out.println(String.format(output, ++count, empid, empname, empsalary, location));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}

