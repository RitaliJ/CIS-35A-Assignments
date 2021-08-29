package lab2;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentStatsGenerator implements StudentStats{

	Statistics statStudents = new Statistics();
	@Override
	public void printScoreForStudent(int studentId, Student[] students) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null && students[i].getSID() == studentId) {
				printStudentScore(students[i]);
			}
		}
		
	}
	
	private void printStudentScore(Student student)
	{
		System.out.print("Scores for Student " + student.getSID() + " are: ");
		for(int j = 0; j < 5; j++) {
			System.out.print(student.getScores()[j] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	private void printClassScores(Student[] students) {
		System.out.println("Stud Qu1 Qu2 Qu3 Qu4 Qu5");
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				System.out.print(students[i].getSID() + " ");
				for(int j = 0; j < 5; j++) {
					System.out.print(students[i].getScores()[j] + " ");
				}
				System.out.println();
			}
		}
	}

	@Override
	public void printStudentStats(Student[] students) {
			printClassScores(students);
			
			statStudents.findlow(students);
			statStudents.printLowScores();
			statStudents.findhigh(students);
			statStudents.printHighScores();
			statStudents.findavg(students);
			statStudents.printAvgScores();		
	}
	

	@Override 
	public void createFileForStudents(Student [] students) throws IOException
	{
		for(int i = 0; i < students.length; i++) 
		{
			if(students[i] != null) {
				FileOutputStream fos=null;
				ObjectOutputStream oos=null;
			
				try {
					if(lab2.Driver.DEBUG )
					{
						System.out.println("Creating serialized file : " + students[i].getSID() +".txt");
					}
					 fos = new FileOutputStream(students[i].getSID() +".txt");
					 oos = new ObjectOutputStream(fos);
					 oos.writeObject(students[i]);
					 oos.writeObject(statStudents);
					 
					if(lab2.Driver.DEBUG )
					{
						System.out.println("File contains student scores: ");
						printStudentScore(students[i]);
						
						System.out.println("File contains class statistics ");
						statStudents.printLowScores();;
						statStudents.printHighScores();
						statStudents.printAvgScores();
						System.out.println();
					}
				}catch(IOException ex){
					System.out.print(ex);
				}
				finally {
					oos.close();
					fos.close();
				}
			}			
		}
	}
}
