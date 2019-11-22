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
	public T pop() {
		Node temp = head;
		T data=null;
		if (head == null) {
			System.out.println("List is Empty..!!");
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println("Removed element :" + temp.next.data);
			data=(T)temp.data; 
			temp.next = null;
		}
		return data;
	}

	/**
	 * Removing from list
	 */
	public void remove() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is Empty..!!");
		} else 
		{
			while (temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println("Removed element :" + temp.next.data);
			temp.next = null;
		}
	}

	/**
	 * searching the item
	 */
	public boolean search(T item) {

		Node temp = head;
		if (head.data.equals(item)) {
			return true;
		}
		while (temp.next != null) {
			temp = temp.next;
			if (temp.data == item || temp.data.equals(item)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * remove a perticular item
	 */
	public void removeItem(T item)
	{
		Node temp=head;
		Node prev=null;
		if(head==null)
		{
			System.out.println("List is empty..!!");
			return;
		}
		if(head.data.equals(item))
		{
			head = head.next;
		}
		else
		{
			while(temp.next!=null)
			{
				if(temp.data.equals(item))
				{
					System.out.println("Removed :"+temp.data);
					prev.next=temp.next;	
					return;
				}
				prev=temp;
				temp=temp.next;
			}
		}
	}

	/**
	 * Checking either list is empty or not
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	/**
	 * 
	 * @return
	 */
	public T pop(int pos)
	{
		Node temp=head;
		Node prev=null;
		T data=null;
		if(pos==0)
		{ 
			data=(T)head.data;
			head=head.next;
			return (T) data;
		}
		for(int i=0;i<pos;i++)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next.next;
		return temp.data;


	}

	/**
	 * Size of the list
	 */
	public int size() {
		Node temp = head;
		int size = 0;
		if (head == null) {
			System.out.println("list is empty");
		} else {
			while (temp.next != null) {
				size++;
				temp = temp.next;
			}
		}
		return size;
	}

	/**
	 * Adding the node in last of list
	 */
	public void append(T data) {
		Node node = new Node(data);
		Node temp = head;
		if (head == null) {
			head = node;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;

	}

	/**
	 * Returns the position of item.
	 */
	public int index(T item) {
		int position = 0;
		Node temp = head;
		if (head == item) {
			return position;
		}
		while (temp.next != null) {
			position++;
			temp = temp.next;
			if (temp.data == item || temp.data.equals(item)) {
				return position;
			}
		}
		return -1;
	}

	/**
	 * Inserting the item in position
	 */
	public void insert(int pos, T data) {
		Node node = new Node(data);
		Node temp = head;
		if (pos == 0) {
			head = node;
		} else
			for (int i = 0; i < pos-1; i++) {
				temp = temp.next;
			}
		node.next = temp.next;
		temp.next = node;
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
		LinkedList list = new LinkedList();

	//	System.out.println("List is Empty :" + list.isEmpty());
		list.add("bhai");
	//	System.out.println("position :" + list.index("bhai"));
		list.add("nana");
	//	System.out.println("Size :" + list.size());
		list.add("kaka");
		list.add("lala");
		list.add(5.5);
		list.add(10);
		list.show();
		System.out.println("item :" + list.search(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("hihihAHA :"+list.pop(2));
		System.out.println("Size :" + list.size());
		list.show();
		System.out.println("item :" + list.search("kaka"));
		System.out.println("item :" + list.search("kaki"));
		list.pop();
		list.remove();
		list.removeItem("nana");

		list.insert(1, 15);
		list.insert(0, 5);
		list.append(100);
		list.show();
		System.out.println("List is Empty :" + list.isEmpty());
		System.out.println("Size :" + list.size());
		System.out.println("item position :" + list.index(60));


	}

}
