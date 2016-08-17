package toDo;


public class ToDo {
	
	String description;
	boolean isChecked = false;
	
	public ToDo(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public String getCheckbox() {
		if(this.isChecked)
			return "☑";
		else
			return "☐";
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	
	
	
	

}
