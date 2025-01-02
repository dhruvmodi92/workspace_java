package org.dhruv;

class RodCutting
{
    /* Returns the best obtainable price for a rod of
       length n and price[] as prices of different pieces */
    static int cutRod(int price[],int n)
    {
        int val[] = new int[n+1];
        val[0] = 0;
 
        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        /*for (int i = 1; i<=n; i++)
        {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max_val = Math.max(max_val, 
                                   price[j] + val[i-j-1]);
            val[i] = max_val;
        }
        for(int i : val)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        return val[n];*/
        
        for(int i =1 ; i <= n ;i++)
        {
        	int max = 0;
        	int temp = 0;
        	for(int j = 0; j < i ;j++)
        	{
        		temp = price[j]+val[i - j-1];
        		if(temp > max)
        			max = temp;
        	}
        	val[i] = max;
        
        }
        for(int i : val)
        	System.out.print(i+" ");
        return val[n];
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is " +
                            cutRod(arr, size));
    }
}
/* This code is contributed by Rajat Mishra */
