package org.dhruv.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionUsingJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> personList = Arrays.asList(
				new Person(1,"Aneri",25),
				new Person(2,"Dhruv",26),
				new Person(3,"Kausha",20),
				new Person(4,"Alpa",46),
				new Person(5,"Rina",46),
				new Person(6,"Rajesh",56),
				new Person(7,"Dilip",51));
		
		printList(personList);
		//sort by name
		Collections.sort(personList,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Person p1 = (Person)o1;
				Person p2 = (Person)o2;
				
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		System.out.println("After Sorting");
		printList(personList);
	}

	
	public static void printList(List<Person> list)
	{
		for(Person p : list)
		{
			System.out.println("Id : "+p.getId()+" Name : "+p.getName()+" Age : "+p.getAge());
		}
	}
}
