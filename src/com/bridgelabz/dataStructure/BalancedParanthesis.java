/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : Balancing parenthesis.
 * @Date    : 25:11:2019
 * @File    : BalancedParanthesis.java
 * ***************************************************/


package com.bridgelabz.dataStructure;

import com.bridgelabz.dataStructure.base.Stack;

public class BalancedParanthesis {
	public static void main(String[] args) {
		
//Stack object created
		Stack<Object> bp = new Stack<Object>();
		String input = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		char ch[] = input.toCharArray();
// adding and removing '(' and ')'.
		for (char in : ch) {
			if (in == '(') {
				bp.push('(');
			} else if (in == ')') {
				bp.pop();
			}
		}
//to check list is empty or not
		if (bp.isEmpty() == true) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

	}

}
