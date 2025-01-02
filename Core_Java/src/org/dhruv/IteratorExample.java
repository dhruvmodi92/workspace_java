package org.dhruv;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {

	public static void main(String rgs[])
	{
		LinkedList<Integer> list = new LinkedList();
		list.add(2);
		list.add(12);
		list.add(22);
		list.add(32);
		list.add(42);
		list.add(52);
		list.add(62);
		list.add(72);
		
		
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			if(i == 32)
				itr.remove();
			
		}
		
		System.out.println(list);
		
		LinkedList<StudentIterate> list1 = new LinkedList<StudentIterate>();
		StudentIterate s1 = new StudentIterate(1,"Dhruv");
		StudentIterate s2 = new StudentIterate(2 ," Aneri");
		StudentIterate s3 = new StudentIterate(3,"Jinesh");
		
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		
		
		
		
		list1.remove(new StudentIterate(3,null));
		
		
		System.out.println(list1);
		
		
		
	}
}


class StudentIterate
{
	int id;
	String name;
	
	StudentIterate(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj)
	{
		if(((StudentIterate)obj).id == this.id)
			return true;
		
		return false;
	}
	
}