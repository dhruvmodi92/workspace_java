package org.dhruv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class ExampleList {
	public static void main(String args[])
	{
		Dog d1 = new Dog("One");
		/*List<Dog> list = new ArrayList<Dog>();
		list.add(d1);
		list.add(new Dog("Two"));
		list.add(new Dog("Three"));
		System.out.println("Size : "+list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(((Dog)itr.next()).getName());	
		}

		list.add(new Dog("one"));
		itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(((Dog)itr.next()).getName());	
		}*/

		/*
		 Set set = new HashSet();

		set.add(d1);
		set.add(new Dog("Two"));
		set.add(new Dog("Three"));
		Boolean b = set.add(new Dog("Two"));
		System.out.println(b);*/

		Map<Object,Object> map = new HashMap<Object,Object>();
		map.put("one", d1);
		map.put("two", new Dog("Two"));
		map.put(2, new Dog("Four"));
		map.put(1,"Modi..the great");
		map.put(new Integer(3), "Kaliya");
		System.out.println(map.put(d1,"Har Har Mahadev"));//null
		map.put(new Dog("Five"), "Bhole shambhu");
		map.put( new Cat(),"Jay jay Shiv Shankar");
		map.put(null, "Abe ka kar rhe ho..");
		//map.put("one","Work hard");
		System.out.println(map.put(d1,"do a mistake"));//Har Har Mahadev

		System.out.println(((Dog)map.get("one")).name);
		System.out.println(map.get(1));
		System.out.println(((Dog)map.get(2)).name);
		System.out.println(map.get(new Integer(3)));
		System.out.println(map.get(d1));
		System.out.println(map.get(new Dog("Five")));
		System.out.println(map.get(new Cat()));
		System.out.println(map.get(null));
		//d1.name = "Three";
		//System.out.println(map.get(d1));
		/*d1.name = "one";
		System.out.println(map.get(new Dog("one")));*/
		System.out.println(map.get(new Dog("One")));

		/*Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(((Dog)itr.next()).getName());
		}*/

	}
}

class Cat
{

}
class Dog
{

	String name;
	Dog(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean equals(Object o)
	{
		if((o instanceof Dog) && (((Dog)o).name == name))
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