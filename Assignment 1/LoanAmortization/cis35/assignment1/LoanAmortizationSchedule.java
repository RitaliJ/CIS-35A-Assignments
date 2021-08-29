package cis35.assignment1;

/**
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 1
 * Due: July 2, 2021
 * Submitted: July 2, 2021
 */

import java.util.Scanner;

public class LoanAmortizationSchedule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Enter loan amount
		System.out.print("Enter loan amount,  e.g., 10000.00: ");
		double loanAmount = input.nextDouble();
		if(loanAmount < 0) {
			loanAmount = loanAmount*(-1);
		}
		
		// Enter number of years
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		if(numberOfYears < 0) {
			numberOfYears = numberOfYears*(-1);
		}
		
		
		// Enter annual interest rate in percentage
		System.out.print("Enter annual interest rate, e.g., 7.25: ");
		double annualInterestRate = input.nextDouble();
		if(annualInterestRate < 0) {
			annualInterestRate = annualInterestRate*(-1);
		}
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / 
		(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		//Display
		System.out.printf("Monthly Payment: %.2f%n", (int)(monthlyPayment * 100) / 100.0);
		System.out.printf("Total Payment: %.2f%n", (int)(totalPayment * 100) / 100.0);
		
		input.close();
		
		//set initial balance as loan amount
		double balance = loanAmount;
		System.out.printf("Payment#  \t  Interest  \t  Principal  \t  Balance %n");
		
		//iterations through for loop
		for (int i = 1; i <= numberOfYears * 12; i++) { 
			double interest = monthlyInterestRate * balance; 
			double principal = monthlyPayment - interest; 
			balance = balance - principal;
			System.out.printf("%d  \t\t  %.2f  \t  %.2f  \t  %.2f %n", i, interest, principal, balance);
		}		

	}

}
