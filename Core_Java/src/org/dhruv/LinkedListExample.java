package org.dhruv;

import java.util.LinkedList;

public class LinkedListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		LinkedList lst = new LinkedList();
		lst.offer("Alpa");
		lst.add("Dhruv");
		lst.add(0,"Aneri");
		
		lst.addFirst("Dhan");
		lst.addLast("Modi");
		
		
		System.out.println(lst);
	}

}
