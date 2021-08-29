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

public class Statistics {
	int [] lowscores = new int [5];

	int [] highscores = new int [5];

	float [] avgscores = new float [5];

	public void findlow(Student[] a) {
		for(int i = 0; i < lowscores.length; i++) {
			int minScore = Integer.MAX_VALUE;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					if(a[j].getScores()[i] < minScore) {
						minScore = a[j].getScores()[i];
					}
				}
			}
			lowscores[i] = minScore;
		}


	}

	public void findhigh(Student[] a) {
		for(int i = 0; i < highscores.length; i++) {
			int maxScore = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					if(a[j].getScores()[i] > maxScore) {
						maxScore = a[j].getScores()[i];
					}
				}
			}
			highscores[i] = maxScore;
		}
	}

	public void findavg(Student [] a) {

		for(int i = 0; i < avgscores.length; i++) {
			int sumOfScores = 0;
			int counter = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != null) {
					sumOfScores += a[j].getScores()[i];
					counter++;
				}
			}
			avgscores[i] = sumOfScores/counter;
		}

	}

	//add methods to print values of instance variables.
	public void printLowScores() {
		System.out.println("The low scores for each quiz are: ");
		for(int i = 0; i < lowscores.length; i++) {
			System.out.print(lowscores[i] + " ");
		}
		System.out.println( );
	}
	
	public void printHighScores() {
		System.out.println("The high scores for each quiz are: ");
		for(int i = 0; i < highscores.length; i++) {
			System.out.print(highscores[i] + " ");
		}
		System.out.println( );
	}
	
	public void printAvgScores() {
		System.out.println("The average scores for each quiz are: ");
		for(int i = 0; i < avgscores.length; i++) {
			System.out.print(avgscores[i] + " ");
		}
		System.out.println( );
	}
}
