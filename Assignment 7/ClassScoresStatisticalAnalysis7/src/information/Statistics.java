package information;

import java.io.Serializable;

/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 7
 * Due: August 2, 2021
 * Submitted: August 2, 2021
 *
 */

public class Statistics implements Serializable{
	public static final long serialVersionUID = 77L;
	int [] lowscores1 = new int [5];
	int [] highscores1 = new int [5];
	float [] avgscores1 = new float [5];
	int [] lowscores2 = new int [5];
	int [] highscores2 = new int [5];
	float [] avgscores2 = new float [5];
	
	//constructors
	public Statistics() {
	}
	
	public Statistics(Student[] a) {
		findlow(a);
		findhigh(a);
		findavg(a);
	}
	
	//methods
	public void findlow(Student[] a) {
		for(int i = 0; i < lowscores1.length; i++) {
			int minScore = Integer.MAX_VALUE;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					if(a[j].getScores("chemistry")[i] < minScore) {
						minScore = a[j].getScores("chemistry")[i];
					}
				}
			}
			lowscores1[i] = minScore;
		}
		
		for(int i = 0; i < lowscores2.length; i++) {
			int minScore = Integer.MAX_VALUE;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					if(a[j].getScores("computer science")[i] < minScore) {
						minScore = a[j].getScores("computer science")[i];
					}
				}
			}
			lowscores2[i] = minScore;
		}


	}

	public void findhigh(Student[] a) {
		for(int i = 0; i < highscores1.length; i++) {
			int maxScore = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					if(a[j].getScores("chemistry")[i] > maxScore) {
						maxScore = a[j].getScores("chemistry")[i];
					}
				}
			}
			highscores1[i] = maxScore;
		}
		
		for(int i = 0; i < highscores2.length; i++) {
			int maxScore = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					if(a[j].getScores("computer science")[i] > maxScore) {
						maxScore = a[j].getScores("computer science")[i];
					}
				}
			}
			highscores2[i] = maxScore;
		}
	}

	public void findavg(Student [] a) {

		for(int i = 0; i < avgscores1.length; i++) {
			int sumOfScores = 0;
			int counter = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					sumOfScores += a[j].getScores("chemistry")[i];
					counter++;
				}
			}
			avgscores1[i] = sumOfScores/counter;
		}
		
		for(int i = 0; i < avgscores2.length; i++) {
			int sumOfScores = 0;
			int counter = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					sumOfScores += a[j].getScores("computer science")[i];
					counter++;
				}
			}
			avgscores2[i] = sumOfScores/counter;
		}

	}

	//add methods to print values of instance variables.
	public void printLowScores() {
		System.out.println("The low scores for each quiz for chemistry are: ");
		for(int i = 0; i < lowscores1.length; i++) {
			System.out.print(lowscores1[i] + " ");
		}
		System.out.println();
		
		System.out.println("The low scores for each quiz for computer science are: ");
		for(int i = 0; i < lowscores2.length; i++) {
			System.out.print(lowscores2[i] + " ");
		}
		System.out.println();
	}
	
	public void printHighScores() {
		System.out.println("The high scores for each quiz for chemistry are: ");
		for(int i = 0; i < highscores1.length; i++) {
			System.out.print(highscores1[i] + " ");
		}
		System.out.println( );
		
		System.out.println("The high scores for each quiz for computer science are: ");
		for(int i = 0; i < highscores2.length; i++) {
			System.out.print(highscores2[i] + " ");
		}
		System.out.println( );
	}
	
	public void printAvgScores() {
		System.out.println("The average scores for each quiz for chemistry are: ");
		for(int i = 0; i < avgscores1.length; i++) {
			System.out.print(avgscores1[i] + " ");
		}
		System.out.println( );
		
		System.out.println("The average scores for each quiz for computer science are: ");
		for(int i = 0; i < avgscores2.length; i++) {
			System.out.print(avgscores2[i] + " ");
		}
		System.out.println( );
	}
}
