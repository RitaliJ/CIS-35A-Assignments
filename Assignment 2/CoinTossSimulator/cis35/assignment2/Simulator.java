/**
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 2
 * Due: July 11, 2021
 * Submitted: July 11, 2021
 */

package cis35.assignment2;

public class Simulator {
	
	public Simulator() {
	}
	
	int numberOfHeads = 0;
	int numberOfTails = 0;
	
	public void tossForSimulation(Coin c, int xTimes) {
		numberOfHeads = 0;
		numberOfTails = 0;
		
		for(int i = 1; i <= xTimes; i++) {
			c.toss();
			if (c.getSideUp().equals("heads")){
				numberOfHeads += 1;
			}else {
				numberOfTails += 1;
			}
			System.out.println("Toss " + i + ": " + c.getSideUp());
		}
		System.out.println();
	}
	
	public void printStats(Coin c) {
		tossForSimulation(c, 20);
		System.out.println("After " + 20 + " tosses, there were " + numberOfHeads + 
				" heads and " + numberOfTails + " tails.");
	}

}
