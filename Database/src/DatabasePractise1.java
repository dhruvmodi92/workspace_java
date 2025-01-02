import java.sql.*;
import java.util.Properties;

public class DatabasePractise1 {

	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost";
	
	static final String userName = "root";
	static final String password = "root";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//register for sql driver
			Class.forName(JDBC_DRIVER);
			
			
			//Open database connection
			//conn = DriverManager.getConnection(URL, userName, password);
			
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			conn = DriverManager.getConnection(URL, prop);
			System.out.println("Successfully Connected to database..");
			
			stmt = conn.createStatement();
			
			String sql = "CREATE DATABASE FAMILY";
			stmt.execute(sql);
			System.out.println("Successfully created database..");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(stmt != null)
				{
					stmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(conn != null)
				{
					conn.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}

		}
		
	}

}
