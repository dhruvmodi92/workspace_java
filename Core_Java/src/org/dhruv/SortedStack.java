package org.dhruv;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Stack;

public class SortedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(11);
		s.push(56);
		s.push(9);
		s.push(2);
		s.push(45);
		s.push(43);
		
		System.out.println(s);
		
		
		Stack result = sort(s);
		
		System.out.println(result);
		
		
		
	}
	
	static Stack sort(Stack org)
	{
		Stack result = new Stack();
		while(!org.isEmpty())
		{
			int pop = (int) org.pop();
			if(!result.isEmpty())
			{
				int peek = (int)result.peek();
				while(!result.isEmpty() && pop < peek)
				{
					org.push(result.pop());
					if(!result.isEmpty())
						peek = (int) result.peek();
					
				}
				
				result.push(pop);
			}
			else
			{
				result.push(pop);
			}
		}
		return result;
	}

}
