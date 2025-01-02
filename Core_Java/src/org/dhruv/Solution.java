package org.dhruv;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(Solution.getConsOcc1(input));
    }
    
    public static int getConsOcc1(int input)
    {
        int finalResult = 1;
        int currMod = 0;
        int prevMod = 0;
        int noOfOcc = 1;
        while(input != 0)
        {
            currMod = input % 2;
            input = input/2;
            if(currMod == 1)
            {
            	
            	if(prevMod == 1)
            	{
            		noOfOcc++;
            		if(noOfOcc > finalResult)
            			finalResult = noOfOcc;
            	}
            	else
            	{
            			noOfOcc = 1;
            	}
            }
            prevMod = currMod;
        }
        
        return finalResult;
    }
}