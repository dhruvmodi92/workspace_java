import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableUpdate {
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
				
				System.out.println("Now updating a value....");
				
				//Updating entries in table
				sql = "UPDATE REGISTRTION SET name = 'Khushbu',age = '24' WHERE id = 4";
				stmt.executeUpdate(sql);
				
				sql = "UPDATE REGISTRTION SET name = 'Parth',age = '24' WHERE id = 5";
				stmt.executeUpdate(sql);
				
				System.out.println("successfully updated in table");
				System.out.println("After update in table");
				sql = "SELECT * FROM REGISTRTION WHERE id in (1,4,5,6)";
				rs = stmt.executeQuery(sql);
				System.out.println("After updating entries table");
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
