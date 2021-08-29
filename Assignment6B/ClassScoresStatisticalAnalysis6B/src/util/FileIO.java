package util;
/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 6B
 * Due: August 2, 2021
 * Submitted: August 2, 2021
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

import exception.StudentGradingException;
import information.*;

public class FileIO {
	//serialize student files method using StudentGrade
	public static void createFileForStudents(Student[] students) throws StudentGradingException{
		for(int i = 0; i < students.length; i++) 	{
			if(students[i] != null) {
				FileOutputStream fos=null;
				ObjectOutputStream oos=null;
			
				try {
					 fos = new FileOutputStream(students[i].getSID() +".txt");
					 oos = new ObjectOutputStream(fos);
					 StudentGrade studentGrade = new StudentGrade(students[i]);
					 studentGrade.initializeStats(students);
					 
					 oos.writeObject(studentGrade);
					 File tempFile = new File(students[i].getSID() +".txt");
					 System.out.println("Created serialized file " + tempFile.getName() + " with size " + tempFile.length() + " bytes");
				}catch(IOException ex){
					throw new StudentGradingException(ex.getMessage());
				}
				finally {
					try {
						oos.close();
						fos.close();
					} catch (IOException ioEx){
						throw new StudentGradingException(ioEx.getMessage());
					}
					
				}
			}			
		}
	}
	
	//read file and build student array method
	public static Student[] readFile(String filename, Student [] stu) throws StudentGradingException {
		try {
			//Open the file using FileReader Object.
			//In a loop read a line using readLine method.

			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			int studentCounter = -1;
			while (!eof) {
				String line = buff.readLine();

				if (line == null) {
					eof = true;
				}else {
					
					if(studentCounter == -1) {
						studentCounter++;
						continue;
					}
					//Tokenize each line using StringTokenizer Object

					//Each token is converted from String to Integer using parseInt method
					
					Student s = new Student();
					StringTokenizer st = new StringTokenizer(line);
					boolean firstValueOfLine = true;
					int quizCounter = 0;
					int[] scores = new int[5];
					
				    while (st.hasMoreTokens()) {
				    	if(firstValueOfLine) {
				    		s.setSID(Integer.parseInt(st.nextToken()));
				    		firstValueOfLine = false;
				    	}else {
				    		scores[quizCounter] = Integer.parseInt(st.nextToken());
				    		quizCounter++;
				    	}
				    }
					//Value is then saved in the right property of Student Object.
				    s.setScores(scores);
				    stu[studentCounter] = s;
				    studentCounter++;
				}
			}

			buff.close();
			file.close();

		} catch (IOException e) {
				System.out.println("Error -- " + e.toString());
				throw new StudentGradingException(e.getMessage());
			}
		return stu;

		}
}
