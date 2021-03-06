/* **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose:  Base class for Hashing function
 * @Date    : 24:11:2019
 * @File    : DeQueue.java
 * ***************************************************/

package com.bridgelabz.dataStructure.base;

public class Hashing<T> {
	@SuppressWarnings("unchecked")
	Node<T>[] arr = new Node[11];
	Node<T> head;

	@SuppressWarnings("hiding")
	public class Node<T> {
		Node<T> next;
		T data;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * @purpous add elements
	 * @param generic type data
	 * @return void
	 */
	public void add(T data) {
		Node<T> node = new Node<T>(data);
		int da = (int) data;
		int index = da % 11;
		if (arr[index] == null) {
			arr[index] = node;
		} else {
			Node<T> temp = arr[index];

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	/**
	 * @purpous Display the elements
	 * @param generic type data
	 * @return void
	 */
	public void display() {
		System.out.println("Remainder " + " values:-");
		for (int i = 0; i < arr.length; i++) {
			Node<T> temp = arr[i];
			boolean flag = true;
			if (temp != null) {
				flag = false;
				System.out.print(" [" + i + "]     ");
				while (temp != null) {
					System.out.print(temp.data + "  ");
					temp = temp.next;
				}
			} else {
				flag = true;
			}

			if (flag) {
			} else {
				System.out.println();
			}
		}
	}
}
