package driver;

import java.io.IOException;

import exception.StudentGradingException;
import information.*;
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
public class Driver2 {

	public static void main(String[] args) throws StudentGradingException {
		// Demonstrates serializing StudentGrade object
		
		Student[] classOfStudents = new Student[40];
		//Populate the student array
		classOfStudents = FileIO.readFile("studentrawscores.txt", classOfStudents);
		FileIO.createFileForStudents(classOfStudents);
	}
}
