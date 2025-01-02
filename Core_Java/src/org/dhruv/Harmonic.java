package org.dhruv;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the for the length of the harmonic series : ");
		Integer num = in.nextInt();
		double result = 0;
		if(num instanceof Integer )
		{
			for(double i = 1;i<=num;i++)
			{
				System.out.print("1/"+i);
				result = result+ (double)(1)/i;
				if(i != num)
				{
					System.out.print(" + ");
				}
				else
				{
					System.out.print(" = "+result);
				}
			}
		}
		else
		{
			System.out.println("Enter valid integer");
		}
		in = null;
	}

}
