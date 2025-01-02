import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableInsert {

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
			System.out.println("select datbase successfully");
			
			String sql = "INSERT INTO REGISTRTION "+
					"VALUES(6,'Aneri',22)";
			stmt.executeUpdate(sql);
			System.out.println("successfully updated Anu");
			
			sql = "INSERT INTO REGISTRTION VALUES(7,'Runali',22)";
			stmt.executeUpdate(sql);
			System.out.println("successfully updated Runali");
			
			sql = "INSERT INTO REGISTRTION VALUES(8,'Sachchi',22)";
			stmt.executeUpdate(sql);
			System.out.println("successfully updated Sachchi");
			//System.out.println("Created table in given database");

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
