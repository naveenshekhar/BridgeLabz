/* ****************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Functional-Utility
 * @Date    : 02:11:2019 - 04:11:2019
 * @File    : Utility.java
 * ****************************************************/
package com.bridgelabz.utility;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	public static Scanner sc = new Scanner(System.in);

	public static void isReplace() {
		String str = "Hello <<UserName>>, How are you?";
		System.out.println("Enter Your name :");
		String str1 = sc.next();
		String replace = str.replaceAll("<<UserName>>", str1);
		System.out.println(replace);
		sc.close();
	}

	public static void isFlip(int n) {
		double head = 0;
		double tail = 0;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				if (Math.random() >= 0.5) {
					head++;
				} else {
					tail++;
				}
			}
		} else {
			System.out.println("Please enter positive integer.");
		}
		double h_per = (head / n) * 100;
		double t_per = (tail / n) * 100;
		System.out.println("Percentage of head vs tail is :" + (int) h_per + "%" + " vs " + (int) t_per + "%");
		sc.close();
	}

	public static void isLeapYear(int n) {
		if (n > 999 && n <= 9999) {
			if (n % 4 == 0 && n % 400 == 0 || n % 100 != 0) {
				System.out.println("Leap year.");
			} else {
				System.out.println("Not a leap year.");
			}
		} else {
			System.out.println("Please enter 4 digit number.");
		}
		sc.close();
	}

	public static void isHarmonic(int n) {
		double harmonic = 1;
		if (n != 0) {
			for (double i = 1; i <= n; i++) {
				harmonic = harmonic + (1 / i);
			}
			System.out.println("Nth Harmonic value :" + (int) harmonic);
		}
	}
	
	public static Object[][] TwoDInput() 
	{
	System.out.println("Enter the rows :");	
	int m=sc.nextInt();
	System.out.println("Enter the coloums :");
	int n=sc.nextInt();
	Object array[][]=new Object[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			array[i][j]=sc.next();
		}
	}
	return array;
}

	public static void isTwoDArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int m = sc.nextInt();
		System.out.println("Enter number of coloums :");
		int n = sc.nextInt();
		int[][] array = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println(" ");
		}
		sc.close();
	}

	
	public static void isQuadratic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a = sc.nextInt();
		System.out.println("Enter value of b :");
		int b = sc.nextInt();
		System.out.println("Enter value of c :");
		int c = sc.nextInt();

		int delta = b * b - 4 * a * c;
		int root1 = (int) ((-b + Math.sqrt(delta)) / 2 * a);
		int root2 = (int) ((-b - Math.sqrt(delta)) / 2 * a);

		System.out.println("Root 1 of 'X' :" + root1);
		System.out.println("Root 2 of 'X' :" + root2);
		sc.close();
	}

	public static void isAnagram(String str1, String str2) {
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean result = Arrays.equals(ch1, ch2);

		if (result) {
			System.out.println("Anagram..!!");
		} else {
			System.out.println("Not Anagram..!!");
		}
	}

	public static void isPrime(int n) {

		int flag = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println(i + " ");
			}
		}
	}
	/*
	 * ****************************************************
	 * 
	 * @Author : Naveen Shekhar
	 * 
	 * @version : Eclipse
	 * 
	 * @ purpose: Algorithm-Utility
	 * 
	 * @Date : 05:11:2019 - 08:11:2019
	 * 
	 * @File : *****************************************************
	 */

	public static void isWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 / m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		switch (d0) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}
	/*
	 * 
	 * 
	 */

	public static void isTemprature(int temp, String i) {
		switch (i) {
		case "f":
			int F = (temp * 9 / 5) + 32;
			System.out.println(F);
			break;

		case "c":
			int C = (temp - 32) * 5 / 9;
			System.out.println(C);
		}
	}

	/*
	 * 
	 * 
	 */

	public static void isMonthlyPayment(int P, int Y, int R) {
		int n = 12 * Y;
		int r = R / (12 * 100);
		int payment = (int) (P * r) / 1 - (1 + r) ^ (-n);
		System.out.println(payment);
	}

	/*
	 * 
	 * 
	 * 
	 */

	public static void isSqrt(double c) {
		double t = c;
		double epsilon = 0.00248;
		double var1 = Math.abs(t - c / t);
		double var2 = epsilon * t;
		int count = 0;
		while (var1 > var2) {
			t = ((c / t) + t) / 2;
			if (c % t == 0)//
			{
				System.out.println(t);
				break;
			} else if (count == 20) {
				System.out.println("Given number is not perfect SqureRoot..!!");
				break;
			}
			count++;
		}
	}

	/*
	 * 
	 * 
	 */
	public static String toBinary(int n) {
		String r = "";
		int i = 0;
		while (n >= 1) {
			int a = n % 2;
			r = r + a;
			n = n / 2;
			i++;
		}
		String s = "";
		for (i = r.length() - 1; i >= 0; i--) {
			s = s + r.charAt(i);
		}
		return s;
	}

	/*
	 * 
	 * 
	 * 
	 */

	public static int[] input1DArray(int size) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[size];
		System.out.println("Enter elements of array :");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	// 1D String array input

	public static String[] Input1DStringArray(int size) {
		Scanner sc = new Scanner(System.in);
		String array[] = new String[size];
		System.out.println("Enter elements of array :");
		for (int i = 0; i < size; i++) {
			array[i] = sc.next();
		}
		return array;

	}

	// printing 1D integer Array

	public static void print1DArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// Printing 1D String array

	public static void print1DStringArray(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	// Binary search for integer
	public static int isBinary(int item, int[] inputArray) {
		int li = 0;
		int hi = inputArray.length - 1;

		while (li <= hi) {
			int mid = (li + hi) / 2;
			if (item == inputArray[mid]) {
				return mid;
			}
			if (item > inputArray[mid]) {
				li = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;
	}

	// Binary search for String.
	public static int isBinaryString(String item, String[] inputArray) {
		int li = 0;
		int hi = inputArray.length - 1;
		while (li < hi) {
			int mi = (li + hi) / 2;
			if (item.equals(inputArray[mi])) {
				return mi;
			} else if (item.compareTo(inputArray[mi]) < 0) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
		}
		return -1;
	}

	// Bubble sort for integer

	public static int[] isBubble(int numbers[]) {
		int temp;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		return numbers;
	}

	public static int[] insertionSort(int[] array) {
		int temp, j;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i;
			while (j > 0 && array[j - 1] > temp) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;
		}
		return array;
	}

	public static String[] insertionSortString(String words[]) {
		String temp;
		for (int i = 1; i < words.length; i++) {
			for (int j = i; j > 0; j--) {
				if (words[j].compareTo(words[j - 1]) < 0) {
					temp = words[j];
					words[j] = words[j - 1];
					words[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		return words;
	}

	public static int swapNibble(int number) {

		return ((number & 0x0F) << 4 | (number & 0xF0) >> 4);

	}

}
