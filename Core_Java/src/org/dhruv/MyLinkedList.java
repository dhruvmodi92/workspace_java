package org.dhruv;

public class MyLinkedList {
	private Node first;
	public MyLinkedList()
	{
		first = null;
	}
	
	public void insert(int data1)
	{
		Node node = new Node(data1);
		node.nextNode = first;
		first = node;
	}
	
	
	public void printList()
	{
		Node currentNode = first;
		System.out.println("List : ");
		while(currentNode != null)
		{
			currentNode.printNode();
			currentNode = currentNode.nextNode;
		}
	}
	
	
}

class Node
{
	public int data1;
	public Node nextNode;
	
	public Node(int data1)
	{
		this.data1 = data1;
	}
	
	public void printNode()
	{
		System.out.println(data1);
	}
}

