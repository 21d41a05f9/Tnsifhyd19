package sri.code.com;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class UpdateData
	{
		public static void main(String[] args)
		{
			String dbURL = "jdbc:mysql://localhost:3306/employeedb";
			String username = "root";
			String password = "9603294792";
			 
			try {
			 
			    Connection conn = DriverManager.getConnection(dbURL, username, password);
			    String sql = "UPDATE employee SET empname=?, empsalary=?, location=? WHERE empid=?";
			    PreparedStatement statement = conn.prepareStatement(sql);
			    statement.setString(1, "Molgari pavankumar");
			    statement.setString(2, "100000");
			    statement.setString(3, "Delhi");
			    statement.setString(4, "1729");
			     
			    int rowsUpdated = statement.executeUpdate();
			    if (rowsUpdated > 0)
			    {
			        System.out.println("An existing user was updated successfully!");
			    }
			}
			catch (SQLException ex) 
			{
			    ex.printStackTrace();
			}
		}
	}

		

		

		

	
