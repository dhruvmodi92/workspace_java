package org.dhruv;
import java.sql.*;

public class DatabaseCreation {

	//JDBC Driver name and url
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/";

	//Database credential
	static final String USER ="root";
	static final String PASS = "root";

	public static void main(String orgs[])
	{
		Connection conn = null;
		Statement stmt = null;
		try
		{
			//Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");

			//open a connection
			System.out.println("Connecting to database..");
			conn = DriverManager.getConnection(URL, USER, PASS);

			//Execute a query
			System.out.println("Execute a query...Creating database...");
			stmt = conn.createStatement();

			String sql ="CREATE DATABASE STUDENTS";
			stmt.executeQuery(sql);
			System.out.println("Database created successfully...");


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
		System.out.println("Hi Bro...");
	}
}
