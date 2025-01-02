package org.dhruv;

import java.util.*;


public class HashMapExample {
	public static void main(String args[])
	{
		Map<Tiger,Object> map = new HashMap<Tiger,Object>();
		Tiger t1 = new Tiger("Dhruv");
		Tiger t2 = new Tiger("Aneri");
		System.out.println(map.put(t1, "Jay Hind"));
		System.out.println(map.put(t2, "India"));
		//t2.name = "Dhruv";
		System.out.println(map.put(t2, "Bharat"));
		//t2 = t1;
		System.out.println(map.put(t2,"Hindustan"));
		System.out.println((String)map.get(t1));
		System.out.println((String)map.get(t2));
		System.out.println(map.size());
	}
}

class Lion
{

}
class Tiger
{

	String name;
	Tiger(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean equals(Object o)
	{
		if((o instanceof Tiger) && (((Tiger)o).name == name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int hashCode()
	{
		System.out.println(name.length());
		return name.length();
	}

}
