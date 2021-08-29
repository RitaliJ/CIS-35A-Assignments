package adapter;

import information.Student;

public interface StudentAPI {
	public abstract void printStudentStatistics();
	public abstract void printScoreForStudentGivenID(int studentId);
}
