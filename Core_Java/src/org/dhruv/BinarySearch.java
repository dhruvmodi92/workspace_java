package org.dhruv;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int noOfElement = in.nextInt();
		int elements[] = new int[noOfElement];
		System.out.println("Enter the elements : ");
		for(int i=0;i<noOfElement ; i++)
		{
			elements[i]= in.nextInt();
		}
		Arrays.sort(elements);
		System.out.println("Enter the value you want to search : ");
		int search = in.nextInt();
		int first = 0;
		int last = noOfElement -1;
		int middle = (first+last)/2;
		
		while(first <= last)
		{
			if(elements[middle]< search)
			{
				first = middle + 1;
				
			}
			else if(elements[middle] == search)
			{
				System.out.println(search + " found at location  : "+(middle + 1));
				break;
			}
			else
			{
				last = middle -1;
			}
			middle = (first + last)/2;
		}
		if(first>last)
		{
			System.out.println(search + " is not found");
		}
	}

}
