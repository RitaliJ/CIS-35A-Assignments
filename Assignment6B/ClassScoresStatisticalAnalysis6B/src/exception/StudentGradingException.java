package exception;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 6B
 * Due: August 2, 2021
 * Submitted: August 2, 2021
 *
 */
public class StudentGradingException extends Exception{
	public StudentGradingException(String message) {
		super(message);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("exceptionlog.txt");
			System.out.println("Exception log created at exceptionlog.txt");
			bos = new BufferedOutputStream(fos);
			bos.write(message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			}catch (IOException ex) {}
		}
	}
}
