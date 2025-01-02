package org.dhruv;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int size = in.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i<size;i++)
		{
			array[i] = in.nextInt();
			
		}
		
		System.out.println("before the bubble sort : ");
		for(int i = 0;i<size;i++)
		{
			System.out.print(array[i]+" ");
			
		}
		
		for(int i=0;i<size -1;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp= array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
			
			
		}
		System.out.println("After the bubble sort : ");
		for(int i = 0;i<size;i++)
		{
			System.out.print(array[i]+" ");
			
		}
	}

}
