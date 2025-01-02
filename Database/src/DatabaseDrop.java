import java.sql.*;


public class DatabaseDrop {

	//JDBC driver name and url name
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/";
	
	//Database credential
	static final String USER = "root";
	static final String PASS = "root";
	
	public static void main(String args[])
	{
		Connection conn = null;
		Statement stmt = null;
		try
		{
			//JDBC Driver Registeration
			Class.forName(JDBC_DRIVER);
			
			//connection to database
			System.out.println("Establishing connection to database");
			conn = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("Connected to database successfully");
		
			//Execute a query
			System.out.println("Executing a query");
			stmt = conn.createStatement();
			
			String sql = "DROP DATABASE STUDENTS";
			stmt.executeUpdate(sql);
			System.out.println("Deleted database successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(stmt != null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			
		}
	}
}
