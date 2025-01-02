package org.dhruv;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class MyComparator implements Comparator
{
    public int compare(Object a,Object b)
    {
        List<Integer> s1 = (List<Integer>)a;
        List<Integer> s2 = (List<Integer>)b;
        if(s1.size() > s2.size())
            return -1;
        else if (s1.size() < s2.size())
            return +1;
        else
            return 0;
    }
}
public class SolutionLongestSeq {

    static int[] longestCommonSubsequence(int[] a, int[] b) {
        // Complete this function
        
        if(a.length >= b.length)
        {
            int[] result = new int[b.length];
            TreeSet<List<Integer>> set = new TreeSet(new MyComparator());
            for(int i = 0 ; i < b.length;i++)
            {
                List<Integer> list = new ArrayList<Integer>();
                int indFind = find(a,b[i],0);
                if(indFind < 0)
                {
                    continue;
                }
                else
                {
                    list.add(b[i]);
                    for(int j =i+1  ;j < b.length;j++ )
                    {
                    	if(indFind >= a.length-1)
                    		break;
                        int ind = find(a,b[j],indFind+1);
                        if(ind<0)
                        {
                            continue;
                        }
                        else
                        {
                        	indFind = ind;
                            list.add(b[j]);
                        }
                    }
                }
                set.add(list);
            }
            result = set.first().stream().mapToInt(i->i).toArray();
            return result;
        }
        else if(a.length < b.length)
        {
            int[] result = new int[a.length];
            List<List<Integer>> set = new ArrayList();
            for(int i = 0 ; i < a.length;i++)
            {
               
                int indFind = find(b,a[i],0);
                if(indFind < 0)
                {
                    continue;
                }
                else
                {
                    
                    int k = i+1;
                    int rst = indFind;
                    while(k < a.length){
                    	 List<Integer> list = new ArrayList<Integer>();
                    	 list.add(a[i]);
                    for(int j =k  ;j < a.length;j++ )
                    {
                    	if(indFind >= b.length-1)
                    		break;
                        int ind = find(b,a[j],indFind+1);
                        if(ind<0)
                        {
                            continue;
                        }
                        else
                        {
                        	indFind = ind;
                            list.add(a[j]);
                        }
                    }
                    set.add(list);
                    k++;
                    indFind = rst;
                    }
                }
                
            }
            Collections.sort(set,new MyComparator());
            result = set.get(0).stream().mapToInt(i->i).toArray();
            return result;
        }
        return new int[1];
    }
    static int find(int[] arr,int val,int start)
    {
        for(int i = start ; i < arr.length;i++)
        {
            if(val == arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int[] result = longestCommonSubsequence(a, b);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
