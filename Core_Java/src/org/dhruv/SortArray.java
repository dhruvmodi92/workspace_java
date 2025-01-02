package org.dhruv;

public class SortArray {
	final String s = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,1,0,1,1,0,0};
		
		
		
		int j = arr.length -1;
		int i = 0;
		while(i < j)
		{
			
			if(arr[i] == 1 && arr[j] == 0)
			{
				arr[j] = 1;
				arr[i] = 0;
			}
			if(arr[i] == 0)
			{
				i++;
			}
			
			if(arr[j] == 1)
			{
				j--;
				
			}
		}
		
		for(int k : arr)
			System.out.println(k);
	}

}
