package adapter;

import information.Statistics;
import information.Student;
import information.StudentGrade;

public class StudentAPIImpl implements StudentAPI{
	Student[] students;
	Statistics classStats;
	
	public StudentAPIImpl(Student[] students) {
		this.students = students;
		classStats = new Statistics(students);
		
	}
	public void printStudentStatistics() {
		classStats.printLowScores();
		classStats.printHighScores();
		classStats.printAvgScores();
		System.out.println();
	}
	
	
	public void printScoreForStudentGivenID(int studentId) {
		boolean foundStudent = false;
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null && students[i].getSID() == studentId) {
				printStudentScore(students[i]);
				foundStudent = true;
			}
		}
		if(!foundStudent) {
			System.out.println("Could not find Student with ID " + studentId);
		}
		
	}
	
	private void printStudentScore(Student student){
		System.out.print("Scores for Student " + student.getSID() + " are: ");
		for(int j = 0; j < 5; j++) {
			System.out.print(student.getScores()[j] + " ");
		}
		System.out.println();
	}
}
