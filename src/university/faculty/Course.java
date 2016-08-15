package university.faculty;

import java.util.ArrayList;

import university.Student;

public class Course {
	private Department department;
	private String name;
	private String instructorName;
	
	private ArrayList<Student> registeredStudents = new ArrayList<Student>();

	public Course(Department department, String name, String instructorName) {
		super();
		this.department = department;
		this.name = name;
		this.instructorName = instructorName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}

	public void setRegisteredStudents(Student st) {
		registeredStudents.add(st);
		department.appendStudent(st); 
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Course [department=" + department + ", name=" + name + ", instructorName=" + instructorName
				+ ", registeredStudents=" + registeredStudents + "]";
	}
	
	
	
	

}
