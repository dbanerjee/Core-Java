package com.practice.string;

import java.util.Scanner;

/**
 * Sample code to compare two strings in Java using
 * equals(), equalsIgnoreCase(), compareTo() and
 * CompareToIgnoreCase() method
 * @author dbanerjee
 *
 */

public class StringComparison {
	public static void isEqual(String str1, String str2) {
		System.out.println("Checking equality using equals() method\n");
		boolean flag = str1.equals(str2);
		if(flag) {
			System.out.println("The strings are equal.\n");
		} else {
			System.out.println("The strings are not equal.\n");
		}
		
	}
	
	public static void isEqualIgnoreCase(String str1, String str2) {
		System.out.println("Checking equality using equalsIgnoreCase() method.\n");
		System.out.println("Checking equality using equals() method\n");
		boolean flag = str1.equalsIgnoreCase(str2);
		if(flag) {
			System.out.println("The strings are equal.\n");
		} else {
			System.out.println("The strings are not equal.\n");
		}
		
	}
	
	public static void isCompareTo(String str1, String str2) {
		System.out.println("Checking equality using compareTo() method\n");
		int result = str1.compareTo(str2);
		if(result == 0) {
			System.out.println("The Strings are equal.\n");
		} else if (result > 0) {
			System.out.println("2nd String is lexicographically less than 1st String.\n");
		} else if (result > 0) {
			System.out.println("2nd String is lexicographically greater than 1st String.\n");
		}
		
	}
	
	public static void isCompareToIgnoreCase(String str1, String str2) {
		System.out.println("Checking equality using compareToIgnoreCase() method.\n");
		int result = str1.compareToIgnoreCase(str2);
		if(result == 0) {
			System.out.println("The Strings are equal.\n");
		} else if (result > 0) {
			System.out.println("2nd String is lexicographically less than 1st String.\n");
		} else if (result > 0) {
			System.out.println("2nd String is lexicographically greater than 1st String.\n");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("#############################\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String string1 = sc.next();
		System.out.println("Enter the second string. ");
		String string2 = sc.next();
		//System.out.println("Choose your choice of methods:\n");
		//System.out.println();
		sc.close();
		isEqualIgnoreCase(string1, string2);
		isCompareTo(string1, string2);
		
		
	}

}
