package com.practice.string;

import java.util.Scanner;

public class PalindromeSimple {
	public static boolean isPalindrome(String str) {
		if(str == null) 
			return false;
		int length = str.length();
		for(int i = 0; i < length/2; i++) {
			if(str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Checking if String is Palindrome");
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
