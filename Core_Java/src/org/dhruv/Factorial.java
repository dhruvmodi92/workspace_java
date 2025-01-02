package org.dhruv;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = 1;/*Integer.parseInt(args[0]);*/
		
		if(num>0)
		{
			int fact =1;
			for(int i=1;i<=num;i++)
			{
				fact = fact*i;
			}
			System.out.println("Factorial of num "+num+" is : "+fact);
		}
		
		
		
	}

}
