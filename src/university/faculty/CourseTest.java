package university.faculty;

import university.Student;

public class CourseTest {

	public static void main(String args[]) {
		
		Department dept1 = new Department("Computer Engineering", "Engineering");
		
		Student stu2 = new Student("ZEYNEP", "04999", "Fall", 2014);

		dept1.appendStudent(stu2);
		
		System.out.println(dept1);
		
		Course c1 = new Course(dept1, "CS50", "David Malan");
		
		c1.setRegisteredStudents(stu2);
		
		System.out.println(c1);

	}
}
