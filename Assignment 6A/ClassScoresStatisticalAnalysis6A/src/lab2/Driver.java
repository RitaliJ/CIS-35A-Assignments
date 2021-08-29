package lab2;
/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 6A
 * Due: August 1, 2021
 * Submitted: August 1, 2021
 *
 */
import java.io.IOException;

import lab2.*;

public class Driver {
	public static boolean DEBUG = false;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Student[] lab2 = new Student[40];
		
		//Populate the student array
		lab2 = Util.readFile("studentrawscores.txt", lab2);
		
		StudentStats studentStats = new StudentStatsGenerator();
		studentStats.printStudentStats(lab2);
		studentStats.printScoreForStudent(2134, lab2);
		studentStats.printScoreForStudent(1234, lab2);
		//Print the data and statistics
		
		studentStats.createFileForStudents(lab2);
	}
}
