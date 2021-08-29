package driver;

import java.util.Scanner;

import adapter.StudentAPI;
import adapter.StudentAPIImpl;
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
public class Driver3 {

	public static void main(String[] args) throws StudentGradingException{
		/** demonstrating the usage of the Student API **/
		//read file and populate student array
		Student[] classOfStudents = new Student[40];
		classOfStudents = FileIO.readFile("studentrawscores.txt", classOfStudents);
		
		//initialize StudentAPIImpl using the populated student array
		StudentAPI studentAPI= new StudentAPIImpl(classOfStudents);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		Integer studentID = Integer.parseInt(scan.nextLine());

		printOptions();
		//collect char from Scanner
		Character option = Character.toUpperCase(scan.nextLine().charAt(0));
		
		//give desired output
		
		switch(option) {
		case 'A':
			studentAPI.printScoreForStudentGivenID(studentID);
			break;
		case 'B':
			studentAPI.printStudentStatistics();
			break;
		case 'C':
			studentAPI.printScoreForStudentGivenID(studentID);
			studentAPI.printStudentStatistics();
			break;
		default:
			System.out.println("Invalid Option");
		}

		scan.close();

	}
	
	public static void printOptions() {
		System.out.println("What information would you like to see?");
		System.out.println("Type 'A' to view your scores.");
		System.out.println("Type 'B' to view class statistics for the quizzes.");
		System.out.println("Type 'C' to view both.");
	}

}
