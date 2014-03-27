package com.practice.string;

import java.util.Scanner;

public class PalindromeUsingStringBuilder {
	public static boolean isPalindrome(String str) {
		if(str == null) {
			System.out.println("String is empty");
		}
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}

	public static void main(String[] args) {
		System.out.println("Checking if String is Palindrome:\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = sc.next();
		boolean flag = isPalindrome(string);
		if(flag) {
			System.out.println("\nString is Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
		sc.close();
	}
}
