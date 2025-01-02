package org.dhruv;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerSolution {

    static int[] revisedRussianRoulette(char[] doors) {
        // Complete this function
    	String input = new String(doors);
    	int[] result = new int[2];
    	if(Pattern.matches("^[0]+$", input))
    		return result;
    	if(Pattern.matches("^[1]+$", input))
    	{
    		int len = doors.length;
    		result[0] = len/2;
    		result[1] = len;
    		if(len % 2 == 1)
    		{
    			result[0]++;
    		}
    		return result;
    	}
    	
    	Pattern pattern = Pattern.compile("[1]+");
    	Matcher match = pattern.matcher(input);
    	while(match.find())
    	{
    		int diff = match.end() - match.start();
    		result[1]=result[1]+diff;
    		result[0] = result[0]+diff/2;
    		if(diff % 2 == 1)
    		{
    			result[0]++;
    			
    		}
    	}
/*    	if(Pattern.matches("^[0]+$", new String(Arrays.toString(doors))))
    		return result;
    	if(Pattern.matches("^[1]+$", doors.toString()))
    	{
    		int len = doors.length;
    		result[0] = len/2;
    		result[1] = len;
    		if(len % 2 == 1)
    		{
    			result[0]++;
    		}
    		return result;
    	}
    	for(int i = 0 ; i < doors.length; i++)
    	{
    		if(doors[i] == 1)
    		{
    			i++;
    			result[0]++;
    			result[1]++;
    			if(doors[i] == 1)
    			{
    				result[1]++;
    			}
    		}
    	}
*/
    	
    	
    	
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] doors = new char[n];
        for(int doors_i = 0; doors_i < n; doors_i++){
            doors[doors_i] = (char)(in.nextInt()+'0');
            
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
