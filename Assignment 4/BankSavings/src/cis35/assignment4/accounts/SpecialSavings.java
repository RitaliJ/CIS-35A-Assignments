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

public class SpecialSavings extends SavingsAccount{
	//constructors
	public SpecialSavings() {
	}
	public SpecialSavings(double balance) {
		super(balance);
	}
	
	//override calculateMonthlyInterest method from parent class
	@Override
	public double calculateMonthlyInterest() {
		double monthlyInterest;

		if(super.getSavingsBalance() > 10000) {
			System.out.println("Applying 10% interest rate "
					+ "because balance is greater than $10,000.");
			monthlyInterest = super.getSavingsBalance()*10/1200;
		}else {
			monthlyInterest = super.getSavingsBalance()*super.getAnnualInterestRate()/1200;
		}
		
		//update balance and return monthly interest
		super.setSavingsBalance(getSavingsBalance() + monthlyInterest);
		return monthlyInterest;
	}

}
