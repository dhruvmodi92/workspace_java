package org.dhruv;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = /*{ -2, -3, 4, -1, -2, 1, 5, -3 };*//*{1, -2, 1, 1, -2, 1};*/{-1,-2,5,1,6,-4,9,14,-25,8,8,-5,20};
		//int[] arr = {4, -1, -2, 1, 5};
		int[] subArr = findSubArr(arr);
		for(int i : subArr)
		{
			System.out.println(i);
		}
		
	}

	public static int[] findSubArr(int[] arr)
	{
		int[] subArr = new int[arr.length];
		int  start = 0,end = 0;
		int prevMax = 0;
		int currMax = 0;
		int s = 0;
		
		for(int i= 0; i < arr.length ; i++)
		{
			currMax += arr[i];
			
			if(prevMax < currMax)
			{
				prevMax = currMax;
				end = i;
				start = s;
			}
			
			if(currMax < 0)
			{
				currMax = 0;
				s = i+1;
			}
		}
		System.out.println("start : "+start+" end : "+end);
		int j = 0;
		for(int i = start; i <= end;i++)
		{
			subArr[j] = arr[i];
			j++;
		}
		return subArr;
	}
	
}
