import java.sql.*;
public class TableCreate {

	//JDBC driver name and URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL ="jdbc:mysql://localhost/students";

	public static void main(String args[])
	{
		Connection conn = null;
		Statement stmt = null;
		try{
			//Register JDBC Driver
			Class.forName(JDBC_DRIVER);
			System.out.println("Register JDBC Driver");

			//Open database connection
			conn = DriverManager.getConnection(URL, "root","root");
			System.out.println("Successfully open connection to datbase");

			//Execute query
			stmt = conn.createStatement();
			String sql = "CREATE TABLE REGISTRTION "+
					"(id INTEGER not NULL,name VARCHAR(255),age INTEGER,PRIMARY KEY(id))";
			stmt.executeUpdate(sql);
			System.out.println("Created table in given database");

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
