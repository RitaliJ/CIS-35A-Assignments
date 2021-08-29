package cis35.assignment4;
import cis35.assignment4.accounts.*;
/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 4
 * Due: July 25, 2021
 * Submitted: July 25, 2021
 *
 */
public class Driver1 {

	public static void main(String[] args) {
		
		//create two saver accounts
		SavingsAccount saver1 = new SavingsAccount(2000);	
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		//set annual interest rate to 4%
		SavingsAccount.modifyAnnualInterestRate(4);
		
		//print account values for 1st month
		System.out.printf("Account #1\t Annual Interest Rate: %.2f\t Previous Balance: $%.2f\t"
				+ "Monthly Interest: $%.2f\t "
				+ "Updated Balance: $%.2f \n", 
				SavingsAccount.getAnnualInterestRate(), saver1.getSavingsBalance(), 
				saver1.calculateMonthlyInterest(), saver1.getSavingsBalance());
		System.out.printf("Account #2\t Annual Interest Rate: %.2f\t Previous Balance: $%.2f\t"
				+ "Monthly Interest: $%.2f\t "
				+ "Updated Balance: $%.2f \n", 
				SavingsAccount.getAnnualInterestRate(), saver2.getSavingsBalance(), 
				saver2.calculateMonthlyInterest(), saver2.getSavingsBalance());
		
		//set annual interest rate to 5%
		SavingsAccount.modifyAnnualInterestRate(5);
		//print account values for 2nd month
		System.out.printf("Account #1\t Annual Interest Rate: %.2f\t Previous Balance: $%.2f\t"
				+ "Monthly Interest: $%.2f\t "
				+ "Updated Balance: $%.2f \n", 
				SavingsAccount.getAnnualInterestRate(), saver1.getSavingsBalance(), 
				saver1.calculateMonthlyInterest(), saver1.getSavingsBalance());
		System.out.printf("Account #2\t Annual Interest Rate: %.2f\t Previous Balance: $%.2f\t"
				+ "Monthly Interest: $%.2f\t "
				+ "Updated Balance: $%.2f \n", 
				SavingsAccount.getAnnualInterestRate(), saver2.getSavingsBalance(), 
				saver2.calculateMonthlyInterest(), saver2.getSavingsBalance());

	}

}
