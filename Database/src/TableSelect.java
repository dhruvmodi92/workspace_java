import java.sql.*;
public class TableSelect {
	//JBDC Driver name and URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/students";

	public static void main(String args[]) throws SQLException
	{
		Connection conn = null;
		Statement stmt = null;
		try
		{
			//Register JDBC Driver
			Class.forName(JDBC_DRIVER);

			//Open database connection
			conn = DriverManager.getConnection(URL, "root", "root");
			System.out.println("Open database connection...successfully...");

			//Execute query
			System.out.println("Creating statement");
			stmt = conn.createStatement();

			String sql = "SELECT * FROM REGISTRTION WHERE age=22";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next())
			{

				//retrieve by column name
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				//Display values
				System.out.println("ID : "+id+"   NAME : "+name+"   AGE : "+age);

			}
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
			if(stmt != null){stmt.close();}
			if(conn != null){conn.close();}
		}
	}

}
