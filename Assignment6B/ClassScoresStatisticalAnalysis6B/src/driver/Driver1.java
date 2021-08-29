package driver;

import exception.StudentGradingException;
import information.Student;
import util.FileIO;

/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 6B
 * Due: August 2, 2021
 * Submitted: August 2, 2021
 *
 */
public class Driver1 {

	public static void main(String[] args) {
		Student[] classOfStudents = new Student[40];
		String fileName = "studentrawscoreswrong.txt";
		// Demonstrates the usage of exception handler in a driver, throwing, logging and fixing the exception.
		try {
			//Populate the student array
			classOfStudents = FileIO.readFile(fileName, classOfStudents);
			
		}catch(StudentGradingException ex){
			System.out.println("Encountered exception");
			fileName = "studentrawscores.txt";
			System.out.println("Fixed file name, trying again");
		}
		
		try {			
			//Populate the student array
			classOfStudents = FileIO.readFile(fileName, classOfStudents);
			FileIO.createFileForStudents(classOfStudents);
		}catch(StudentGradingException ex){
			System.out.println("Exiting program");
		}
	}

}
