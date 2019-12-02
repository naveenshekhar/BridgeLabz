/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : Base class for UnOrdered list
 * @Date    : 24:11:2019
 * @File    : LinkedList.java
 * ***************************************************/

package com.bridgelabz.dataStructure.base;

public class LinkedList<T> {
	Node head;

	/**
	 * @purpuse :Node nested class for implementing/creating new nodes
	 */
	public class Node {
		public Node next;
		T data;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * @purpose :Add data in list
	 * @param :Generic type data
	 * @return :Nothing
	 */
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
	 * @purpose :remov node/data in list
	 * @param :removing and returning data from end of linked list.
	 * @return :Data inside the removed node
	 */
	public T pop() {
		Node temp = head;
		T data = null;
		if (head == null) {
			System.out.println("List is Empty..!!");
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println("Removed element :" + temp.next.data);
			data = (T) temp.data;
			temp.next = null;
		}
		return data;
	}

	/**
	 * @purpose :remove node/data in list
	 * @param :removing nodes from linked list.
	 * @return :Void
	 */
	public void remove() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is Empty..!!");
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println("Removed element :" + temp.next.data);
			temp.next = null;
		}
	}

	/**
	 * @purpose :Search the item in list
	 * @param :Generic type item
	 * @return :boolean
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
	 * @purpose :Searches and removes the perticular the item in list
	 * @param :Generic type item
	 * @return :void
	 */
	public void removeItem(T item) {
		Node temp = head;
		Node prev = null;
		if (head == null) {
			System.out.println("List is empty..!!");
			return;
		}
		if (head.data.equals(item)) {
			head = head.next;
		} else {
			while (temp.next != null) {
				if (temp.data.equals(item)) {
					System.out.println("Removed :" + temp.data);
					prev.next = temp.next;
					return;
				}
				prev = temp;
				temp = temp.next;
			}
		}
	}

	/**
	 * @purpose :Checking either list is empty or not
	 * @param :Null
	 * @return :boolean
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	/**
	 * @purpose :Pops the data of given position
	 * @param :Integer Position of element
	 * @return :Element
	 */
	public T pop(int pos) {
		Node temp = head;
		Node prev = null;
		T data = null;
		if (pos == 0) {
			data = (T) head.data;
			head = head.next;
			return (T) data;
		}
		for (int i = 0; i < pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next.next;
		return temp.data;
	}

	/**
	 * @purpose :To get the size of LL
	 * @param :Null
	 * @return :Integer size
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
	 * @purpose :Adding the node in last of list
	 * @param :Generic type data
	 * @return :void
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
	 * @purpose :Returns the position of item.
	 * @param :Generic type data
	 * @return :Integer position
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
	 * @purpose :Inserting the item in position
	 * @param :Generic type data
	 * @return :Integer position,data.
	 */
	public void insert(int pos, T data) {
		Node node = new Node(data);
		Node temp = head;
		if (pos == 0) {
			head = node;
		} else
			for (int i = 0; i < pos - 1; i++) {
				temp = temp.next;
			}
		node.next = temp.next;
		temp.next = node;
	}

	/**
	 * @purpose :Displaying the output
	 * @param :Generic type data
	 * @return :void
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
}
