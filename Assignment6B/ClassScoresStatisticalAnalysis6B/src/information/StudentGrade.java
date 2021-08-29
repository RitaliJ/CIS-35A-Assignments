package information;

import java.io.Serializable;

public class StudentGrade implements Serializable{
	public static final long serialVersionUID = 78L;
	Student student;
	static Statistics stats;

	
	public StudentGrade(Student student) {
		this.student = student;
	}
	
	public void initializeStats(Student[] stu){
		if(StudentGrade.stats == null){
			StudentGrade.stats = new Statistics(stu);
		}
	}
	
	
}
