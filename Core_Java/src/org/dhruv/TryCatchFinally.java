package org.dhruv;

public class TryCatchFinally {
	int test()
	{
		try
		{
			System.out.println("Modi");
			//int n = 5/0;
			return 1;
		}
		catch(Exception e)
		{
			return 2;
		}
		finally
		{
			System.out.println("Dhruv");
			return 3;
		}
		
		
	}
	
	public static void main(String args[])
	{
		TryCatchFinally t = new TryCatchFinally();
		System.out.println(t.test());
	}
}
