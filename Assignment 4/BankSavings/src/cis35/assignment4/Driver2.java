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

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SpecialSavings(2000);	
		SavingsAccount saver2 = new SpecialSavings(3000);
		
		SavingsAccount.modifyAnnualInterestRate(4);
		
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
		
		
		//conduct deposits and withdrawals and interest calculations on saver1
		System.out.printf("Account #1\t" + saver1.deposit(1000) + "%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Account #1\t Annual Interest Rate: %.2f\t Previous Balance: $%.2f\t"
				+ "Monthly Interest: $%.2f\t "
				+ "Updated Balance: $%.2f \n", 
				SavingsAccount.getAnnualInterestRate(), saver1.getSavingsBalance(), 
				saver1.calculateMonthlyInterest(), saver1.getSavingsBalance());
		System.out.printf("Account #1\t" + saver1.withdraw(1500) + "%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Account #1\t Annual Interest Rate: %.2f\t Previous Balance: $%.2f\t"
				+ "Monthly Interest: $%.2f\t "
				+ "Updated Balance: $%.2f \n", 
				SavingsAccount.getAnnualInterestRate(), saver1.getSavingsBalance(), 
				saver1.calculateMonthlyInterest(), saver1.getSavingsBalance());

		//conduct deposits and withdrawals and interest calculations on saver2
		System.out.printf("Account #2\t" + saver2.deposit(8000) + "%.2f\n", saver2.getSavingsBalance());
		System.out.printf("Account #2\t Annual Interest Rate: %.2f\t Previous Balance: $%.2f\t"
				+ "Monthly Interest: $%.2f\t "
				+ "Updated Balance: $%.2f \n", 
				SavingsAccount.getAnnualInterestRate(), saver2.getSavingsBalance(), 
				saver2.calculateMonthlyInterest(), saver2.getSavingsBalance());
		System.out.printf("Account #2\t" + saver1.withdraw(11000) + "%.2f\n", saver2.getSavingsBalance());
		System.out.printf("Account #2\t Annual Interest Rate: %.2f\t Previous Balance: $%.2f\t"
				+ "Monthly Interest: $%.2f\t "
				+ "Updated Balance: $%.2f \n", 
				SavingsAccount.getAnnualInterestRate(), saver2.getSavingsBalance(), 
				saver2.calculateMonthlyInterest(), saver2.getSavingsBalance());
		
		
		
		
		

	}

}
