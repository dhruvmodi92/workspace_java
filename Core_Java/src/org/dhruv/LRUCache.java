package org.dhruv;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU ca = new LRU(4);
		ca.add(1);
	    ca.add(2);
	    ca.add(3);
	    ca.add(1);
	    ca.add(4);
	    ca.add(5);
	    
	    ca.display();
		
		
	}

}


class LRU
{
	int size;
	
	NodeLRU end;
	NodeLRU prev = null;
	NodeLRU next = null;
	HashMap<Integer,NodeLRU> map = new HashMap<Integer,NodeLRU>();
	LRU(int size){
		this.size = size;
	}
	
	void add(int val)
	{
		
		if(map.size() < size)
		{
			NodeLRU NodeLRU = map.get(val);
			if(NodeLRU == null)
			{
				
				NodeLRU curr = new NodeLRU(val);
				if(prev != null)
					prev.prev = curr;
				curr.next  = prev;
				
				
				if(map.size() == 0)
				{
					end = curr;
				}
				map.put(val, curr);
				prev = curr;
			}
			else
			{
				
				remove(NodeLRU);
				map.remove(val);
				
				NodeLRU curr = new NodeLRU(val);
				prev.prev = curr;
				curr.next  = prev;
				prev = curr;
			}
		}
		else
		{
			NodeLRU NodeLRU = map.get(val);
			if(NodeLRU == null)
			{
				
				remove(end);
				map.remove(val);
				NodeLRU curr = new NodeLRU(val);
				prev.prev = curr;
				curr.next  = prev;
				prev = curr;
				
			}
			else
			{
				remove(NodeLRU);
				map.remove(val);
				
				NodeLRU curr = new NodeLRU(val);
				prev.prev = curr;
				curr.next  = prev;
				prev = curr;
			}
		}
		
		
	}
	
	
	void remove(NodeLRU NodeLRU)
	{
		NodeLRU prev = NodeLRU.prev;
		NodeLRU next = NodeLRU.next;
		
		if(NodeLRU == end)
		{
			prev.next = null;
			end = prev;
		}
		prev.next = next;
		if(next != null)
		{
			next.prev = prev;
			map.put((int)next.data, next);
		}
		NodeLRU = null;
		
		map.put((int)prev.data, prev);
		
	}
	
	void display()
	{
		NodeLRU n = prev;
		while(n.next != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
	}
}

class NodeLRU
{
	NodeLRU prev;
	NodeLRU next;
	int data;
	NodeLRU(int val)
	{
		this.data = val;
		this.prev = null;
		this.next = null;
	}
}