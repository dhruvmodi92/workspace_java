package org.dhruv;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.head = new LinkedList.Node(1);
		list.head.next = new LinkedList.Node(2);
		list.head.next.next = new LinkedList.Node(3);
		list.head.next.next.next = new LinkedList.Node(4);
		LinkedList.printList(list.head);
		
		LinkedList rlist = new LinkedList();
		rlist.head = LinkedList.reverseList(list.head);
		
		LinkedList.printList(rlist.head);
	}

}


class LinkedList {
	 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    
    static void printList(Node head)
    {
    	Node curr = head;
    	while(curr != null)
    	{
    		System.out.println(curr.data);
    		curr = curr.next;
    	}
    }
    
    static Node reverseList(Node head)
    {
    	Node prev = null;
    	Node curr = head;
    	Node next = null;
    	while(curr != null)
    	{
    		next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
    	}
    	head = prev;
    	return head;
    }    
}