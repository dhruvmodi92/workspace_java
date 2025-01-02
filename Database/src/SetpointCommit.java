import java.sql.*;
public class SetpointCommit {
	//JDBC driver name and URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL ="jdbc:mysql://localhost/students";

	public static void main(String args[]) throws SQLException
	{
		Connection conn = null;
		Statement stmt = null;
		Savepoint savePoint1 = null;
		try{
			//Register JDBC Driver
			Class.forName(JDBC_DRIVER);
			System.out.println("Register JDBC Driver");

			//Open database connection
			conn = DriverManager.getConnection(URL, "root","root");
			System.out.println("Successfully open connection to datbase");
conn.setAutoCommit(false);
			//Execute query
			stmt = conn.createStatement();
			System.out.println("select datbase successfully");
			
			String sql = "INSERT INTO REGISTRTION "+
					"VALUES(12,'Kausha',18)";
			stmt.executeUpdate(sql);
			System.out.println("successfully updated Kausha");
			
			sql = "INSERT INTO REGISTRTION VALUES(13,'Jainee',16)";
			stmt.executeUpdate(sql);
			System.out.println("successfully updated Jainee");
			
			savePoint1 = conn.setSavepoint("savePoint1");
			
			sql = "INSERT INTO REGISTRTION VALUES(14,'Dhruvi',18)";
			stmt.executeUpdate(sql);
			System.out.println("successfully updated Dhruvi");
			//System.out.println("Created table in given database");
			
			conn.commit();
		}
		catch(SQLException e)
		{
			System.out.println("Exception");
			conn.rollback(savePoint1);			//e.printStackTrace();

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
