package org.dhruv;

import java.util.Date;

public final class MyImMutable {

	private final String name;
	private final int id;
	private final Date d1;
	
	private MyImMutable(int id,String name,Date d)
	{
		this.id = id;
		this.name = name;
		this.d1 = new Date(d.getTime());
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public Date getD1() {
		return new Date(d1.getTime());
	}
	
	public static MyImMutable getInstance(int id,String name,Date d)
	{
		return new MyImMutable(id, name, d);
	}

	public String toString()
	{
		return getId()+"-"+getName()+"-"+getD1();
	}
}