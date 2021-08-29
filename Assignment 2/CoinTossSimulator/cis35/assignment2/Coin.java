/**
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 2
 * Due: July 11, 2021
 * Submitted: July 11, 2021
 */


package cis35.assignment2;

public class Coin {
	
	//declare instance variable that holds either "heads" or "tails" 
	private String sideUp;
	
	
	//no args constructor which initializes sideUp randomly
	public Coin() {
		//randomly assign value to sideUp
		toss();
		
	}
	
	public void toss() {
		if(((int)(Math.random()*100)) % 2 == 0){
			sideUp = "heads";
		}else {
			sideUp = "tails";
		}
	}
		
	public String getSideUp(){
		return sideUp;
	}	
	
}
