import java.sql.*;
public class DatabaseSelect {
	//JDBC Driver name and url
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/STUDENTS";

	//Database credential
	static final String USER ="root";
	static final String PASS = "root";

	public static void main(String orgs[])
	{
		Connection conn = null;
		//Statement stmt = null;
		try
		{
			//Register JDBC Driver
			Class.forName(JDBC_DRIVER);

			//open a connection
			System.out.println("Connecting to database..");
			conn = DriverManager.getConnection(URL, USER, PASS);



			System.out.println("Connected Database successfully...");


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
