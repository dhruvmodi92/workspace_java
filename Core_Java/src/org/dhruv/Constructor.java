package org.dhruv;

public class Constructor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow c = new Cow();
		Cow c2 = new Cow();
	}

}

class Animal
{
	
	static
	{
		System.out.println("Animal static block");
	}
	
	{
		System.out.println("Animal initialization block");
	}
	Animal()
	{
		System.out.println("Animal");
	}
}

class Cow extends Animal
{
	
	static
	{
		System.out.println("Cow static block");
	}
	
	{
		System.out.println("Cow initialization block");
	}
	Cow()
	{
		this("mother");
		System.out.println("Cow");
	}
	Cow(String s)
	{
		System.out.println("Cow arg");
	}
}
