/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 5
 * Due: August 1, 2021
 * Submitted: August 1, 2021
 *
 */
import lab2.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] lab2 = new Student[40];

		//Populate the student array

		lab2 = Util.readFile("studentrawscores.txt", lab2);

		Statistics statlab2 = new Statistics();
		
		printClassScores(lab2);

		statlab2.findlow(lab2);
		statlab2.printLowScores();
		statlab2.findhigh(lab2);
		statlab2.printHighScores();
		statlab2.findavg(lab2);
		statlab2.printAvgScores();

		//Print the data and statistics

	}
	
	public static void printClassScores(Student[] lab2) {
		System.out.println("Stud Qu1 Qu2 Qu3 Qu4 Qu5");
		for(int i = 0; i < lab2.length; i++) {
			if(lab2[i] != null) {
				System.out.print(lab2[i].getSID() + " ");
				for(int j = 0; j < 5; j++) {
					System.out.print(lab2[i].getScores()[j] + " ");
				}
				System.out.println();
			}
		}
	}

}
