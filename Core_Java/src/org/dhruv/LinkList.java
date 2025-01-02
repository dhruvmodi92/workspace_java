package org.dhruv;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		System.out.println(list.add(5));
		System.out.println(list.add("dhruv"));
		list.add(1, "aneri");
		list.addFirst("modi");
		System.out.println(list);
		
	}

}
