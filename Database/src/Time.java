import java.util.*;
import java.sql.*;
public class Time {
public static void main(String args[])
{
	java.util.Date javaDate = new java.util.Date();
	long javaTime = javaDate.getTime();
	
	System.out.println("Java Date is : "+javaDate.toString());
	
	java.sql.Date sqlDate = new java.sql.Date(javaTime);
	System.out.println("Sql Date is : "+sqlDate.toString());
	
	java.sql.Time sqlTime = new java.sql.Time(javaTime);
	System.out.println("Sql Time is : "+sqlTime.toString());

	java.sql.Timestamp sqlTimeStamp = new java.sql.Timestamp(javaTime);
	System.out.println("Sql time stamp is : "+sqlTimeStamp.toString());

}
}
