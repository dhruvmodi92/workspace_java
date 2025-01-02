package org.dhruv;

import java.util.Scanner;
import java.util.Stack;

public class StackMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int noOfQuery = in.nextInt();
		//int maxVal = 0;
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> max = new Stack<Integer>();
		for(int i = 0; i < noOfQuery;i++ )
		{
			int query = in.nextInt();
			//System.out.println(query);
			switch(query)
			{
			case 1 :
			{
				int val = in.nextInt();
				stack.push(val);
				if(max.isEmpty())
				{
					max.push(val);
				}
				else if(max.peek() <= val)
				{
					max.push(val);
					//maxVal = val;
				}
				break;                       
			}

			case 2 :
			{
				if(!stack.isEmpty())
				{
					int pop =stack.pop();
					if(pop == max.peek())
					{
						max.pop();
						
					}
				}
				break;      
			}

			case 3 :
			{
				System.out.println(max.peek());
				break;
			}
			

			}
			//System.out.println(stack);
			//System.out.println(max);
		}
		in.close();
	}

}
