package toDo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {

	public static void printMenu() {
		StringBuilder menu = new StringBuilder();
		
		menu.append("TODOs\n");
		menu.append("=====\n\n");
		
//		for(int i = 0; i < list.size(); i++) {
//			menu.append("(" + (i+1) + ") " + list.get(i).getCheckbox() + "  "+ list.get(i).getDescription() + "\n");
//		}
		int i = 1;
		for (Iterator<ToDo> iter = TodoHelper.getToDoList(); iter.hasNext(); ) {
			ToDo element = iter.next();
			menu.append("(" + i + ") " + element.getCheckbox() + "  "+ element.getDescription() + "\n");
	        i++;
		}
		menu.append("\n\nMENU\n");
		menu.append("=====\n\n");

		menu.append("(0) Exit\n");
		menu.append("(1) Add ToDo\n");
		menu.append("(2) Mark As Done\n");
		menu.append("(3) Remove ToDo\n");
		menu.append("(4) Mark As Undone\n");

		System.out.println(menu.toString());


	}
}
