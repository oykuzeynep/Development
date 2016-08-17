package toDo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoHelper{


	private static List<ToDo> toDoList = new ArrayList<>();
	
	
	public static void addToDo(ToDo todo) {
		toDoList.add(todo);
	}
	
	public static void mark(int index, boolean check) {
		ToDo t = toDoList.get(index);
		t.setChecked(check);

	}
	
	public static void remove(int index){
		toDoList.remove(index);
	     
	}

	public static Iterator<ToDo> getToDoList() {
		return toDoList.iterator();
	}
	
	
	public static boolean isValidSize(int index) {
		int size = toDoList.size();
		if(index > size) {
			return false;
		}
		return true;
	}
	


}
