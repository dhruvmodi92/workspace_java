package org.dhruv;

public class Palindrom {
	public static void main(String args[])
	{
		int num = 101;
		int temp = num;
		int rev =0;
		while(num > 0)
		{
			int mod = num % 10;
			num = num/10;
			rev = (rev*10)+mod;
			System.out.println("mod : "+mod+" num : "+num+" rev : "+rev);
		}
		System.out.println(rev);
		if(temp == rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
