/* **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose:  Base class for Palindrome-Checker
 * @Date    : 23:11:2019
 * @File    : DeQueue.java
 * ***************************************************/

package com.bridgelabz.dataStructure.base;

public class DeQueue<T> {
	Node head;

	class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * @purpous add item at front of the dequeue
	 * @param   Generic type item
	 * @return  void
	 */
	public void addFront(T item) {
		Node node = new Node(item);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	/**
	 * @purpous Adding the element in rear.
	 * @param   Generic type item
	 * @return  void
	 */

	public void addRear(T item) {
		Node node = new Node(item);
		Node temp = head;
		if (head == null) {
			head = node;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node = temp;
		}
	}

	/**
	 * @purpous Removing the elements of DeQueue from front
	 * @param   nothing
	 * @return  data stored in head
	 */
	public T removeFront() {
		T data = head.data;
		head = head.next;
		return data;
	}

	/**
	 * @purpous Removing the elements of DeQueue from rear
	 * @param   Nothing
	 * @return  data stored in last node
	 */
	public T removeRear() {
		Node temp = head;
		T data = null;
		Node prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		data = temp.data;
		prev.next = null;
		return data;
	}
	
	/**
	 * @purpous Checking waether list is empty or not
	 * @param   Nothing
	 * @return  boolean
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}
	
	/**
	 * @purpous returning size of deQueue
	 * @param   Nothing
	 * @return  Integer Size
	 */
	public int size() {
		Node temp = head;
		int size = 0;
		if (head == null) {
			System.out.println("Queue is empty");
		} else {
			while (temp != null) {
				size++;
				temp = temp.next;
			}
			return size;
		}
		return -1;
	}
	/**
	 * @purpous Displaying the elements of DeQueue
	 * @param   Nothing
	 * @return  void
	 */
	public void show() {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty..!!");
		} else {
			while (temp.next != null) {
				System.out.print(temp.data + "");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
