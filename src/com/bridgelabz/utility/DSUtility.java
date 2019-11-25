package com.bridgelabz.utility;

import java.util.Arrays;

public class DSUtility {

	public static boolean isPrime(int n) {
		boolean res = true;

		for (int j = 2; j <= n / 2; j++) {
			if (n % j == 0) {
				res = false;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		System.out.println(isAnagram(117, 171));

	}

	public static int count(int n) {
		String str1 = String.valueOf(n);
		int l1 = str1.length();
		return l1;
	}

	public static boolean isAnagram(int n, int m) {

		int l1 = count(n);
		int l2 = count(m);
		if (l1 != l2) {
			return false;
		}
		int i = 0;
		int j = 0;
		int n1[] = new int[l1];
		int n2[] = new int[l2];
		while (n != 0 && m != 0) {
			int r = n % 10;
			int e = m % 10;
			n1[i] = r;
			n2[j] = e;
			n /= 10;
			m /= 10;
			i++;
			j++;
		}
		Arrays.sort(n1);
		Arrays.sort(n2);
		if (Arrays.equals(n1, n2))
			return true;
		else
			return false;
	}

}