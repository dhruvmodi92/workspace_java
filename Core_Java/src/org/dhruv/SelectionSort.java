package org.dhruv;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int size = in.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements : ");
		for(int i =0; i<size;i++)
		{
			array[i] = in.nextInt();
		}
		System.out.println("before selection sort : ");
		for(int i = 0; i< size;i++)
		{
			System.out.print(array[i]+" ");
		}

		
		for(int i = 0;i<size-1;i++)
		{
			int index = i;
			for(int j = i+1 ; j<size;j++)
			{
				if(array[index] > array[j])
				{
					index = j;
				}
			}
			if(i != index)
			{
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
			/*for(int k = 0;k<size;k++)
			{
				System.out.print(array[k]+" ");
			}
			System.out.print("\n");*/
		}
		
		System.out.println("after selection sort : ");
		for(int i = 0; i< size;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
