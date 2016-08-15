package university.faculty;

import java.util.ArrayList;

import university.Student;

public class Department {

	private String deptName;
	private String facultyName;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Department(String deptName, String facultyName) {
		super();
		this.deptName = deptName;
		this.facultyName = facultyName;
	}

	public void appendStudent(Student st) {
		students.add(st);
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", facultyName=" + facultyName + ", students=" + students + "]";
	}
	
	
	
	
}


