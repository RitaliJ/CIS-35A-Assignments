package lab2;
/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 5
 * Due: August 1, 2021
 * Submitted: August 1, 2021
 *
 */
public class Student {
	private int SID;
	private int scores[] = new int[5];
	
	//write public get and set methods
	
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}

	//add methods to print values of instance variables.
	public void printScores() {
		System.out.println("The scores for Student with ID " + SID +
				" are: ");
		for(int i = 1; i <= scores.length; i++) {
			System.out.println("Quiz " + i +": " + scores[i]);
		}
	}
}
