package org.dhruv;

import java.util.Date;

public class TestImMutable {

	public static void main(String args[])
	{
		MyImMutable im = MyImMutable.getInstance(1, "Dhruv", new Date());
		System.out.println(im);
		Change(im.getId(),im.getName(),im.getD1());
		System.out.println(im);
	}
	
	private static void Change(int id,String name,Date d1)
	{
		id =2;
		name = "Aneri";
		d1 = new Date();
	}
}
