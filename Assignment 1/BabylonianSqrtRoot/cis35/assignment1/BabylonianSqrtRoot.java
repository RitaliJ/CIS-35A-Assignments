package cis35.assignment1;
/**
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 1
 * Due: July 2, 2021
 * Submitted: July 2, 2021
 */

import java.util.Scanner;

public class BabylonianSqrtRoot {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// ask for a number
		System.out.print("Enter a number to find its sqrt: ");
		long number = input.nextLong();
		
		// Display the answer
		System.out.println("The square root of  " + number + " is approximately: " + sqrt(number));
		
		input.close();

	}
	
	//approximation process for square root
	public static double sqrt(long n) {
		//Initial guesses using simple positive value
		long lastGuess = 1;	
		long nextGuess = (lastGuess + n / lastGuess) / 2; 
		
		//test using while loop to find a value such that difference between guesses is less than 0.0001
		while(Math.abs(nextGuess - lastGuess) >  0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		//return the approximation
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}

}
