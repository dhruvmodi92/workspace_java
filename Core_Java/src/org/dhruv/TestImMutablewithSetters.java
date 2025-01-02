package org.dhruv;

public class TestImMutablewithSetters {
	public static void main(String args[])
	{
		ImMutableWithSetter im1 = ImMutableWithSetter.getInstance(1,"Aneri",23);
		System.out.println(im1);
		System.out.println(im1.setId(2));
		System.out.println(im1);
	}
}
