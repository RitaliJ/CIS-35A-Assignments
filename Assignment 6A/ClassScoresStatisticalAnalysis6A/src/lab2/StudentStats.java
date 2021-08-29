package lab2;

import java.io.IOException;

public interface StudentStats {
	public void printScoreForStudent(int studentId, Student[] students);
	public void printStudentStats(Student[] students);
	public void createFileForStudents(Student[] students)  throws IOException;
}
