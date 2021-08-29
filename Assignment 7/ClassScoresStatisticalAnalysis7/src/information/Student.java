package information;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 7
 * Due: August 2, 2021
 * Submitted: August 2, 2021
 *
 */
public class Student implements Serializable{
	public static final long serialVersionUID = 79L;
	private int SID;
	
	HashMap<String, int[]> subjectMap = new HashMap<String, int[]>();
	
	//write public get and set methods
	
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public int[] getScores(String subject) {
		return subjectMap.get(subject);
	}

	public void setScores(String subject, int[] scores) {
		subjectMap.put(subject, scores);
	}

	//add methods to print values of instance variables.
	public void printScores(String subject) {
		System.out.println("The scores for " + subject + " for Student with ID " + SID +
				" are: ");
		int [] scores = subjectMap.get(subject);
			
		for(int i = 1; i <= scores.length; i++) {
			System.out.println("Quiz " + i +": " + scores[i]);
		}
	}
}
