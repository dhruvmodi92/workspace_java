package org.dhruv;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "dhruv";
		int i =0;
				int length = original.length();
				char reverse[] = new char[length];
				char temp[] = new char[length];

		temp = original.toCharArray();
		for(i=0;i<length;i++)
		{
			reverse[i] = temp[length-i-1];
		}
		
		String reverseString = new String(reverse);
		
		System.out.println(reverseString);
		
		
	}

}
