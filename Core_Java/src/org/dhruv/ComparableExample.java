package org.dhruv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableExample{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(1);
		list.add(15);
		list.add(10);
		
		/*System.out.println(list);
		Collections.sort(list);
		System.out.println(list);*/
		
		
		Building b1 = new Building("anand");
		
		Building b2 = new Building("vivek");
		Building b3 = new Building("atul");
		Building b4 = new Building("residence garden");
		Building b5 = new Building("meghvarsha");
		List<Building> blist = new ArrayList<Building>();
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		blist.add(b4);
		blist.add(b5);
		
		Iterator<Building>  iterate = blist.iterator();
		while(iterate.hasNext())
		{
			System.out.println(iterate.next().getName());
		}
		
		Collections.sort(blist);
		System.out.println("After sorting....");
		for(Building build : blist)
		{
			System.out.println(build.getName());
		}
	}
}

class Building implements Comparable<Building>
{
	private String name;
	Building(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public int compareTo(Building arg0) {
		// TODO Auto-generated method stub
		
		
		return this.name.compareTo(arg0.name);
	}
	
}
