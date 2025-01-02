package org.dhruv;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionHacker {
    
    

public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        String magz = in.nextLine();
        String[] magArr = magz.split(" ");
        
        
        System.out.println(in.hasNextLine());
        String[] rans = (in.nextLine()).split(" "); 
        in.close();
        
        System.out.println(find(magArr,rans,m,n));
    }
    
    static String find(String[] magazine,String[] ransom,int m,int n)
    {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            Integer count = map.get(magazine[magazine_i]);
            if(count == null)
                map.put(magazine[magazine_i],1);
            else
                map.put(magazine[magazine_i],count++);
        }
        String find = "Yes";
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            Integer count = map.get(ransom[ransom_i]);
            if(count == null)
            {
                find = "No";
                break;
            }
            else
            {
                count--;
                if(count < 0)
                {
                    find = "No";
                    break;
                }
                else
                    map.put(ransom[ransom_i],count);
            }
                
        }
        return find;
    }
}
