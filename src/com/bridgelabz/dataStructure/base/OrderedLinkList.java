package com.bridgelabz.dataStructure.base;

import com.bridgelabz.dataStructure.base.LinkedList.Node;

public class OrderedLinkList<T extends Comparable> {
	Node head;

	class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(T item) {
		Node node = new Node(item);
		Node temp = head;
		Node prev = null;
		if (head == null) {
			head = node;
		} else if (head.data.compareTo(item) >0) {
			node.next = head;
			head = node;
		}

		else {
			while (temp.data.compareTo(item) > 0 && temp.next != null) {

				prev = temp;
				temp = temp.next;
			}
			prev.next = node;
			node.next = temp;
		}
	}

	/**
	 * Displaying the output
	 */
	public void show() 
	{
		Node temp = head;
		if (head == null)
		{
			System.out.println("list is empty..!!");
		} else 
		{
			while (temp.next != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	public static void main(String[] args) {

		OrderedLinkList<Integer> oll = new OrderedLinkList<Integer>();

		oll.add(100);
		oll.add(20);
	
		oll.add(15);
		oll.show();
	}

}
