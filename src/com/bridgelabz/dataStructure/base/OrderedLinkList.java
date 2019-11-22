package com.bridgelabz.dataStructure.base;

public class OrderedLinkList<T extends Comparable> {
	Node head;
	Node tail;

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
		} else if (item.compareTo(head.data) < 0) {
			node.next = head;
			head = node;
		} else {
			while (temp.next != null) {
				if (temp.data.compareTo(item) < 0 && temp.next.data.compareTo(item) > 0) {
					node.next = temp.next;

					temp.next = node;
					return;
				}
				temp = temp.next;
			}
			temp.next = node;
			node.next = null;
		}
	}

	/**
	 * Removing the perticular element
	 */
	public void remove(T item) {
		Node temp = head;
		Node prev = null;
		if (item.equals(head.data)) {
			head = head.next;

		} else {
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
				if (temp.data.equals(item)) {
					prev.next = prev.next.next;
					temp.next = null;
					return;
				}

			}
			prev.next = null;
		}
	}

	/**
	 * 
	 */
	public boolean search(T item)
	{
		Node temp=head;
		if(head.data.equals(item))
		{
			return true;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
				if(temp.data.equals(item))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Checks either list is empty or not
	 */
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	
	/**
	 *Returns the size of the list.
	 */
	public int size()
	{ 
		int size=0;
		Node temp=head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else;
		while(temp.next!=null)
		{
			size++;
			temp=temp.next;	
		}
		return size;
	}
	
	/**
	 * Displaying the output
	 */
	public void show() {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty..!!");
		} else {
			while (temp.next != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	public static void main(String[] args) {

		OrderedLinkList<Integer> oll = new OrderedLinkList<Integer>();

		System.out.println(oll.isEmpty());
		oll.add(63);
		oll.add(43);
		oll.add(53);
		oll.add(45);
		oll.add(100);
		oll.add(2000);
		oll.add(1500);
		oll.add(15);
		oll.remove(43);
		oll.remove(2000);
		oll.show();
		System.out.println(oll.isEmpty());
		System.out.println(oll.search(150));
		System.out.println(oll.search(1500));
		oll.show();
		System.out.println(oll.size());
	}

}
