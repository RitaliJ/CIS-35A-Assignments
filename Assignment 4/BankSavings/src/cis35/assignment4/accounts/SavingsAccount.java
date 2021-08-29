package cis35.assignment4.accounts;
/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 4
 * Due: July 25, 2021
 * Submitted: July 25, 2021
 *
 */

public class SavingsAccount {
	
	//fields
	private static double annualInterestRate;
	private double savingsBalance;
	
	//constructors
	public SavingsAccount(){
	}
	public SavingsAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}
	
	//getter and setters
	//no setter for savingsBalance
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public static void modifyAnnualInterestRate(double annualInterestRate) {
		if(annualInterestRate >= 0) {
			SavingsAccount.annualInterestRate = annualInterestRate;
		}else {
			System.out.println("Interest Rate must be positive");
		}
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	//protected so people cannot change the balance
	protected void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	//calculations
	public double calculateMonthlyInterest() {
		double monthlyInterest = savingsBalance*annualInterestRate/1200;
		savingsBalance += monthlyInterest;
		return monthlyInterest;
	}
	
	//deposit method
	public String deposit(double amount) {
		savingsBalance += amount; 
		return "$" + amount + " deposited. New Balance is $";
	}
	
	//withdrawal method
	public String withdraw(double amount) {
		if(savingsBalance < amount) {
			return "Attempted to withdraw " + amount + ". Cannot Withdraw. Balance is still $";
		}else {
			savingsBalance -= amount;  
			return "$" + amount + " withdrawn. New Balance is $";
		}
	}

}
