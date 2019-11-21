package com.bridgelabz.dataStructure.base;

public class LinkedList<T> {
	Node head;

	public class Node {
		Node next;
		T data;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(T data) {
		Node node = new Node(data);
		Node temp = head;

		if (head == null) {
			head = node;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	/**
	 * removing from end of linked list.
	 */
	public void pop()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("List is Empty..!!");
		}
		else
		{
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			System.out.println("Removed element :"+temp.next.data);
			temp.next=null;
		}
	}

	/**
	 * Removing from list
	 */
	public void remove()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("List is Empty..!!");
		}
		else
		{
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			System.out.println("Removed element :"+temp.next.data);
			temp.next=null;
		}
	}
	/**
	 * searching the item
	 */
	public boolean search(T item)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			if(temp.data==item)
			{
				return true;			
			}
			else if(temp.data.equals(item))
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}

	/**
	 * Displaying the output
	 */

	public  void show() {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty..!!");
		} else {
			while (temp.next != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add("bhai");
		list.add("nana");
		list.add("kaka");
		list.add("lala");
		list.add(5.5);
		list.add(10);
		System.out.println(list.search(190));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.show();
		System.out.println(list.search("kaka"));


		list.pop();
		list.remove();
		list.show();

	}

}
