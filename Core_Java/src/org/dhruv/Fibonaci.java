package org.dhruv;

public class Fibonaci {
	public static void main(String args[])
	{
		int num1 = 0, num2 = 1,num3 = 0;
		int count = 16;
		for(int i = 1;i<count;i++)
		{
			if(i==1)
			{
				System.out.print(num1+" "+num2);
				
			}
			else
			{
				num3 = num1+num2;
				System.out.print(" "+num3);
				num1 = num2;
				num2 = num3;
			}
		}
		
	}
}
