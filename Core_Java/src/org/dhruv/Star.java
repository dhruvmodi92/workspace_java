package org.dhruv;

import java.io.IOException;
import java.util.Scanner;

public class Star {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the number of lines : ");
			int num = in.nextInt();
			for(int i = 1;i<=num;i++)
			{
				
				for(int j = 0;j < i; j++)
				{
					System.out.print("*");
				
				}
				System.out.print("\n");
			}
			//Runtime.getRuntime().exec("clear");
		}
	}

}
