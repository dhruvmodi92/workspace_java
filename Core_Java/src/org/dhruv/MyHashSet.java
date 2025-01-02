package org.dhruv;

import java.util.HashSet;

public class MyHashSet {

	
	public static void main(String args[])
	{
		HashSet<Student> ls = new HashSet<Student>();
		
		
		Student s1 = new Student(1,"Aneri",23);
		Student s2 = new Student(2,"Dhruv",24);
		Student s3 = new Student(2,"Dhan",24);
		Student s4 = new Student(3,"Kausha",19);
		System.out.println(ls.add(s1));
		System.out.println(ls.add(s2));
		System.out.println(ls.add(s3));
		System.out.println(ls.add(new Student(3,"Kausha",24)));
		System.out.println(ls.add(s1));
		HashSet<Employee> ls1 = new HashSet<Employee>();
		ls1.add(new Employee(1));
		ls1.add(new Employee(1));
		System.out.println(ls1);
	}
}

class Student
{
	int id;
	String name;
	int age;
	
	Student(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//System.out.println("equals" + super.hashCode());
		Student s = (Student)obj;
		System.out.println("equals"+(this.id == s.id));
		return (this.id == s.id);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		System.out.println("hashcode"+(this.id*4));
		
		return (this.id*4);
	}
	
	

}

class Employee
{
	int id;
	Employee(int id)
	{
		this.id = id;
	}
}