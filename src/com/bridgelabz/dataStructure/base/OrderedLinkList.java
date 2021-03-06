/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : LinkedList base class for ordered-list. 
 * @Date    : 25:11:2019
 * @File    : OrderedLinkList.java
 * ***************************************************/

package com.bridgelabz.dataStructure.base;

@SuppressWarnings("rawtypes")
public class OrderedLinkList<T extends Comparable> { // T extends comparable to get the features of it.
	Node head;
	Node tail;

	// Node class created
	class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	//
	/**
	 * @purpose Add method to add item in linked list
	 * @param item
	 * @return void
	 */
	@SuppressWarnings("unchecked")
	public void add(T item) {
		Node node = new Node(item);
		Node temp = head;
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
	 * @purpose Search the item in the list and removes it
	 * @param item
	 * @return void
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
	 * @purpose Search the item in the list and returns boolean
	 * @param item
	 * @return boolean
	 */
	public boolean search(T item) {
		Node temp = head;
		if (head.data.equals(item)) {
			return true;
		} else {
			while (temp.next != null) {
				temp = temp.next;
				if (temp.data.equals(item)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Purpose Search the item in the list and returns index
	 * 
	 * @param item
	 * @return Int position
	 */
	public int index(T item) {
		Node temp = head;
		int index = 0;
		if (head.data.equals(item)) {
			return index;
		} else {
			while (temp.next != null) {
				temp = temp.next;
				if (temp.data.equals(item)) {
					return index;
				}
				index++;
			}
		}
		return -1;
	}

	/**
	 * Purpose Checks either list is empty or not
	 * 
	 * @param --
	 * @return Boolean
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * Purpose Returns the size of the list.
	 * 
	 * @param --
	 * @return integer size.
	 */
	public int size() {
		int size = 0;
		Node temp = head;
		if (head == null) {
			System.out.println("List is Empty");
		} else
			;
		while (temp.next != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	/**
	 * Purpose Removes and returns the last item in the list
	 * 
	 * @param position
	 * @return popped element
	 */
	public T pop() {
		Node temp = head;
		T item = null;
		{
			while (temp.next.next != null) {
				temp = temp.next;
			}
			item = temp.next.data;
			temp.next = null;
			return item;
		}
	}

	/**
	 * Purpose Removes and returns item at position
	 * 
	 * @param position
	 * @return poppedelement
	 */
	public T pop(int pos) {
		T item = null;
		Node temp = head;
		if (pos == 0) {
			item = head.data;
			head = head.next;
			return item;
		} else {
			for (int i = 0; i < pos; i++) {
				temp = temp.next;
				item = temp.data;
			}
			temp.next = temp.next.next;
			return item;
		}
	}

	/**
	 * Purpose Displaying the output
	 * 
	 * @param --
	 * @return void
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
