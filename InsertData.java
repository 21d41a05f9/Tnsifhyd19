package sri.code.com;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class InsertData {
		public static void main(String[] args) {
			String dbURL = "jdbc:mysql://localhost:3306/employeedb";
			String username = "root";
			String password = "9603294792";
			 
			try {
			 
			    Connection conn = DriverManager.getConnection(dbURL, username, password);
			    String sql = "INSERT INTO employee(empid, empname, empsalary, location) VALUES (?, ?, ?, ?)";
			    
			    PreparedStatement statement = conn.prepareStatement(sql);
			    statement.setString(1, "1729");
			    statement.setString(2, "prakashmolgari");
			    statement.setString(3, "500000");
			    statement.setString(4, "mumbai");
			    statement.setString(1, "1730");
			    statement.setString(2, "pavanmolgari");
			    statement.setString(3, "100000");
			    statement.setString(4, "Kolkata");
			    statement.setString(1, "1731");
			    statement.setString(2, "suryalingam kolla");
			    statement.setString(3, "200000");
			    statement.setString(4, "Puna");
			    statement.setString(1, "1732");
			    statement.setString(2, "saikiran mutyala");
			    statement.setString(3, "1000000");
			    statement.setString(4, "Hyderabad");
			    statement.setString(1, "1733");
			    statement.setString(2, "tarunkumar musham");
			    statement.setString(3, "5000000");
			    statement.setString(4, "Bangalur");
			    int rowsInserted = statement.executeUpdate();
			    if (rowsInserted > 0) {
			        System.out.println("A new user was inserted successfully!");
			    }
			} catch (SQLException ex) {
			    ex.printStackTrace();
			}
		}

}
