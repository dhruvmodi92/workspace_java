package org.dhruv;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionTree {
	 static long findMax(int n, String tree) {

	        long maxSum = 0;
	        String[] arr = tree.split(" ");
	        long rootLevel = 0;
	        long oneLevel = 0;
	        int i = 0;
	        int count = 0;
	        while(count <= n)
	        {
	             int start = (2^i); 
	             int end = (2^(i+1))-1;
	            for(int j = start; j < end ;j++)
	            {
	                if(arr[j].equals("#"))
	                {
	                    
	                    continue;
	                }
	                Long val = Long.parseLong(arr[j]);
	                if(i%2 == 0)
	                    rootLevel += val;
	                else
	                    oneLevel += val;
	                count++;
	            }
	            i++;
	        }
	        if(rootLevel > oneLevel)
	            maxSum = rootLevel;
	        else
	            maxSum = oneLevel;
	    return maxSum;
	    }
	 
	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        long res;
	        int _n;
	        _n = Integer.parseInt(in.nextLine().trim());
	        
	        String _tree;
	        try {
	            _tree = in.nextLine();
	        } catch (Exception e) {
	            _tree = null;
	        }
	        
	        res = findMax(_n, _tree);
	        bw.write(String.valueOf(res));
	        bw.newLine();
	        
	        bw.close();
	    }
}
