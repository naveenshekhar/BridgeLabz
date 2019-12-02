/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : Base class for balance parenthesis.
 * @Date    : 24:11:2019
 * @File    : Stack.java
 * ***************************************************/

package com.bridgelabz.dataStructure.base;

public class Stack<T> {
	Node head;

	class Node {
		Node next;
		T data;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * @purpous pushing the data into stack
	 * @param c
	 * @return void
	 */
	public void push(T c) {
		Node node = new Node(c);
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
	 * @purpous Removing(Popping) the elements of Stack
	 * @param item
	 * @return void
	 */
	public T pop() {
		T data = null;
		Node temp = head;
		if (head == null) {
			System.out.println("Stack is Empty");
		} else if (head.next == null) {
			data = (T) head.data;
			head = null;

		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			data = temp.next.data;
			temp.next = null;
		}
		return data;
	}

	/**
	 * @purpous Checking the stack is empty or not
	 * @returns boolean
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @purpous size of stack
	 * @return int size
	 */
	public int size() {
		int size = 1;
		Node temp = head;
		while (temp.next != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	/**
	 * @purpous Ton returns the top data
	 * @return top data.
	 */

	public T peek() {
		Node temp = head;
		if (head == null) {
			System.out.println("Stack is empty..!!");
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			return temp.data;
		}
		return head.data;
	}

	/**
	 * @author naveen
	 * @purpous Displaying the elements of stack
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
