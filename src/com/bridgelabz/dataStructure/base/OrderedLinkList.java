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
	 * Search the item in the list and returns boolean
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
	 * Search the item in the list and returns index
	 */
	public int index(T item)
	{
		Node temp=head;
		int index=0;
		if(head.data.equals(item))
		{
			return index;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
				if(temp.data.equals(item))
				{
					return index;
				}
				index++;
			}
		}
		return -1;
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
	 * Removes and returns the last item in the list
	 */
	public T pop()
	{
		Node temp=head;
		T item=null;
		{
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			item=temp.next.data;
			temp.next=null;
			return item;
		}
		//return temp.data;
	}
	
	/**
	 * Removes and returns item at position
	 */
	public T pop(int pos)
	{
		T item=null;
		Node temp=head;
		if(pos==0)
		{
			item=head.data;
			head=head.next;
			return item;
		}
		else
		{
			for(int i=0;i<pos;i++)
			{
				temp=temp.next;
				item=temp.data;
			}
			temp.next=temp.next.next;
			return item;	
		}
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
		System.out.println("Size :"+oll.size());
		System.out.println("Index :"+oll.index(15));
		System.out.println("Index :"+oll.index(1500));
		System.out.println("Index :"+oll.index(2000));
		System.out.println("Last item :"+oll.pop());
		System.out.println("Popped item :"+oll.pop(1));
		
		oll.show();
	}

}
