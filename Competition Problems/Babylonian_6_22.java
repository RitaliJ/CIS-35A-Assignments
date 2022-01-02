package cis35.textbook.practice;
import java.util.Scanner;

public class Babylonian_6_22 {
	/* Use Babylonian Method to approximate sqrt root of a number */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number for which you want to find the square root: " );
		long number = input.nextLong();
		if(number < 0) {
			System.out.println("Square root of negative number cannot be calculated");
			System.exit(0);
		}else {
			System.out.println("The square root of " + number + " is approximately: " + sqrt(number));
		}
	
		input.close();

	}
	
	public static double sqrt(long n) {
		long lastGuess = 1;
		long nextGuess = 1;
		
		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;	
		}while(Math.abs(nextGuess-lastGuess) > 0.0001);
		
		return nextGuess;
	}

}
