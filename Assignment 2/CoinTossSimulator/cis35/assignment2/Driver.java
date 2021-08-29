/**
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 2
 * Due: July 11, 2021
 * Submitted: July 11, 2021
 */

package cis35.assignment2;

public class Driver {

	public static void main(String[] args) {
		Simulator s = new Simulator();
		Coin c = new Coin();
		System.out.println("The coin starts off as: " + c.getSideUp());
		System.out.println("Beginning Coin Toss Simulator Program and Fetching Stats... ");
		s.printStats(c);
		

	}

}
