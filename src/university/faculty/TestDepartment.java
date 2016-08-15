package university.faculty;

import university.Student;

public class TestDepartment {
	
	public static void main(String args[]) {
		
		Department dept1 = new Department("Computer Engineering", "Engineering");
		
		Student stu2 = new Student("ZEYNEP", "04999", "Fall", 2014);

		dept1.appendStudent(stu2);
		
		System.out.println(dept1);

	}
	

}
