package org.dhruv;

public class TestSingeleton
{
	public static void main(String[] args){

		//MySingleton st = new MySingleton();
		MySingleton st1 = MySingleton.getInstance();
		MySingleton st2 = MySingleton.getInstance();
		//System.out.println(st);
		System.out.println(st1);
		System.out.println(st2);

	}

}
