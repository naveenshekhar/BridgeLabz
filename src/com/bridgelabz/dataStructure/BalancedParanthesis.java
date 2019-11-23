package com.bridgelabz.dataStructure;

import com.bridgelabz.dataStructure.base.Stack;

public class BalancedParanthesis {
	public static void main(String[] args) {
		Stack<Object> bp = new Stack<Object>();
		String input = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		char ch[] = input.toCharArray();

		for (char in : ch) {
			if (in == '(') {
				bp.push('(');
			} else if (in == ')') {
				bp.pop();
			}
		}

		if (bp.isEmpty() == true) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

	}

}
