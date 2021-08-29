package lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 6A
 * Due: August 1, 2021
 * Submitted: August 1, 2021
 *
 */

public class Util {
	public static Student[] readFile(String filename, Student [] stu) {
		try {
			
			//Reads the file and builds student array.

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
//					System.out.println(line);
					
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
			}
		return stu;

		}

}
