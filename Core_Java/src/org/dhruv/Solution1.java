package org.dhruv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution1 {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*Scanner s = new Scanner(System.in);*/
        List<String> input = new ArrayList<String>();
        input.add("YES");
        input.add("NO");
        /*while(s.hasNextLine())
        {
            input.add(s.nextLine());
        }*/
        System.out.println(input.size());
        for(String s1 : input)
        {
            Random random = new Random();
            int low = 3;
            int high = 200;
            int noOfStudent = random.nextInt(high - low) +low;
            if(s1.equalsIgnoreCase("YES"))
            {
                cancelledLect(noOfStudent,noOfStudent-2);
            }
            else
            {
                lect(noOfStudent,noOfStudent-2);
            }
        }
        
        
    }
    
    static void cancelledLect(int noOfStudent,int required)
    {
        System.out.println(noOfStudent+" "+required);
        while(noOfStudent != 0 )
        {
            System.out.print(required+" ");
            required--;
            noOfStudent--;
        }
        System.out.print("\n");
    }
    
    static void lect(int noOfStudent,int required)
    {
        System.out.println(noOfStudent+" "+required);
        required = required - 2*required;
        while(noOfStudent != 0 )
        {
            System.out.print(required+" ");
            required++;
            noOfStudent--;
        }
        System.out.print("\n");
    }
}
