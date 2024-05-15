package sri.code.com;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DeleteData {
		public static void main(String[] args) {
			String dbURL = "jdbc:mysql://localhost:3306/employeedb";
			String username = "root";
			String password = "9603294792";
			 
			try {
			 
			    Connection conn = DriverManager.getConnection(dbURL, username, password);
			    String sql = "DELETE FROM employee WHERE empid=?";
			    
			    PreparedStatement statement = conn.prepareStatement(sql);
			    statement.setString(1, "1732");
			    statement.setString(1, "1729");
			    int rowsDeleted = statement.executeUpdate();
			    if (rowsDeleted > 0) {
			        System.out.println("A user was deleted successfully!");
			    }
			} catch (SQLException ex) {
			    ex.printStackTrace();
			}
		}


}
