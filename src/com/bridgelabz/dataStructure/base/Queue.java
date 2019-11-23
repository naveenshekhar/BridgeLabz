package com.bridgelabz.dataStructure.base;

public class Queue<T> {
	Node head;

	public class Node {
		Node next;
		T data;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public void enqueue(T data) {
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
	 * @author naveen
	 * @purpous returning size of Queue
	 * @return Integer Size
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
	 * @author naveen
	 * @purpous Checking Queue is empty or not.
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	/**
	 * @author naveen
	 * @purpous Removing the elements of Queue
	 * @return void
	 */
	public void dequeue() {
		if (head == null) {
			System.out.println("Queue is Empty..!!");
		} else {
			head = head.next;
		}
	}

	/**
	 * @purpous Displaying the elements of Queue
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
