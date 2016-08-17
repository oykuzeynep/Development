package toDo;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		
		while(!input.equals("0")) {
			Menu.printMenu();			
			input = scanner.nextLine();
			MenuHelper(input);
			

		}
		
		
	}
	
	public static void MenuHelper(String input) {
		String[] params = input.split(",");
		
		int action = Integer.parseInt(params[0]);
		String param = params[1];
		if(action == 0) {
			System.out.println("Exiting...");
			return;
		}
		else if(action == 1) {
			ToDo todo = new ToDo(param);
			TodoHelper.addToDo(todo);
		}
		else if(action == 2) {
			int index = (Integer.parseInt(param) - 1);
			TodoHelper.mark(index, true);
		}
		else if(action == 3) {
			int index = (Integer.parseInt(param)  - 1);
			TodoHelper.remove(index);
		}
		else if(action == 4){
			int index = (Integer.parseInt(param) - 1);
			TodoHelper.mark(index, false);
		}
	
	}

}
