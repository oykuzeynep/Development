package university;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Student {
	
	private String name;
	private String ID;
	private String semester = "Fall";
	private int year;
	private static int currentYear = LocalDateTime.now().getYear();
	private static int currentSemester = 2;
	
	public Student(String name, String iD) {
		super();
		
		name.toUpperCase();
		this.name = name;
		
		ID = iD;
	}
	
	public Student(String name, String iD, String semester, int year) {
		super();
		
		name.toUpperCase();
		this.name = name;
		
		if(iD.length() == 5)
			if(iD.startsWith("04"))
	        	ID = iD;
		
		if(semester.equals("Fall") || semester.equals("Spring") || semester.equals("Summer"))
		    this.semester = semester;
		
		this.year = year;
	}

	public String getName() {
		return name;
	}
	public String getID() {
		return ID;
	}
	public String getSemester() {
		return semester;
	}
	public int getYear() {
		return year;
	}
	public static int getCurrentYear() {
		return currentYear;
	}
	public static int getCurrentSemester() {
		return currentSemester;
	}
	public void setSemester(String semester) {
		if(semester.equals("Fall") || semester.equals("Spring") || semester.equals("Summer"))
		    this.semester = semester;
		else
			this.semester = "Summer";
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static void setCurrentYear(int currentYear) {
		Student.currentYear = currentYear;
	}
	public static void setCurrentSemester(int currentSemester) {
		Student.currentSemester = currentSemester;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", semester=" + semester + ", year=" + year + "]";
	}
	
	

	
	

}
