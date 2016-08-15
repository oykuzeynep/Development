package university;

public class TestStudent {
	
	public static void main(String args[]) {
		Student stu1 = new Student("NERGİS", "04001");
		Student stu2 = new Student("ZEYNEP", "04999", "Fall", 2014);
		
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getID());
		System.out.println(stu2.getSemester());
		System.out.println(stu2.getYear());
		
		stu2.setYear(2016);
		stu2.setSemester("Summer");

		System.out.println(stu2);
		System.out.println(stu1);

		
		
	}

}
