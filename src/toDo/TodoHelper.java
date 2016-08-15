package toDo;

import java.util.ArrayList;
import java.util.List;

public class TodoHelper{


	private static List<ToDo> toDoList = new ArrayList<>();
	
	
	
	public static void addToDo(ToDo todo) {
		toDoList.add(todo);
	}
	
	public static void mark(int index, boolean check) {
		if(check) {
			toDoList.get(index).isChecked = false;
		}
		else
			toDoList.get(index).isChecked = true;

	}
	
	public static void remove(int index){
		toDoList.remove(index);
	     
	}

	public static List<ToDo> getToDoList() {
		return toDoList;
	}
	


}
