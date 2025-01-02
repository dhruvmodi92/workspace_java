import java.sql.*;
public class TablePrepareStatement {

	//JDBC driver name and URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/students";
	
	public static void main(String args[]) throws SQLException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
	
		
		
		try {
			//Register jdbc DRiver
			Class.forName(JDBC_DRIVER);
			
			//open database connection
			conn = DriverManager.getConnection(URL, "root","root");
			System.out.println("open database connection successfully...");
			
			//Execute query
			String sql = "UPDATE REGISTRTION set age = ? WHERE id = ?";
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, 24);
			stmt.setInt(2, 2);
			
			int row = stmt.executeUpdate();
			System.out.println("Successfully updated data...affetceted row : "+row);
			sql = "Select * from REGISTRTION where id = 2";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("successfully executed query");
			while(rs.next())
			{
			System.out.println("after update value of id : "+rs.getInt("id")+" age : "+rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
				stmt.close();
			}
			if(conn != null)
			{
				conn.close();
			}
		}
		//Open connection
	}
	
}
