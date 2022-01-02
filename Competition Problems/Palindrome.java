package cis35.textbook.practice;
import java.util.Scanner;

public class Palindrome {
	
	/* The problem is to write a program that prompts the user to enter a string 
	 * and reports whether the string is a palindrome. 
	 * One solution is to check whether the first character in the string is the same as the last character. 
	 * If so, check whether the second character is the same as the second-to-last character. 
	 * This process continues until a mismatch is found or all the characters in the string are checked, 
	 * except for the middle character if the string has an odd number of characters.
	 */
	
	public static void main(String[] args) {
		// Take String input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a series of characters to determine if it is a palindrome: ");
		String word = input.nextLine();
		//remove spaces to allow for sentence palindromes
		String s = word.toUpperCase();	
		s = s.replaceAll(" ", "");	
		
		boolean isPalindrome = true;
		
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println(word + (isPalindrome?" is a palindrome":" is not a palindrome"));
		
		input.close();
	}

}
