package blog;

import java.util.Iterator;
import java.util.Scanner;



public class Menu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		
		while(true) {
			printMenu();			
			input = scanner.nextLine();
			MenuHelper(input);
		}
		
		
	}

	public static void printMenu() {
		StringBuilder menu = new StringBuilder();
		
		menu.append("\n\nMENU\n");
		menu.append("=====\n\n");

		menu.append("(1) Add Page\n");
		menu.append("(2) Add Post\n");
		menu.append("(3) Add Comment\n");
		menu.append("(4) Show Pages\n");
		menu.append("(5) Show Posts\n");
		
		System.out.println(menu.toString());

	}
	

	
	public static void MenuHelper(String input) {
		Scanner scanner = new Scanner(System.in);
		String title, body, category, author, text, post, url;
		int i = 1;
		Iterator<Page> iter;
		
		int option = Integer.parseInt(input);
		
		switch(option) {
		case 1:
			System.out.println("Title: ");
			title = scanner.nextLine();
			System.out.println("Category:");
			category = scanner.nextLine();
			System.out.println("Body: ");
			body = scanner.nextLine();

			PageHelper.addPage(title, body, category);
			System.out.println("Page " + title + " is created.");
			break;
		case 2:
			System.out.println("\n(1) Add Textpost");
			System.out.println("\n(2) Add Videopost");
			String input2 = scanner.nextLine();
			int option2 = Integer.parseInt(input2);
			
			System.out.println("Title: ");
			title = scanner.nextLine();
			System.out.println("Category:");
			category = scanner.nextLine();
			System.out.println("Body: ");
			body = scanner.nextLine();
			
			switch(option2) {
			case 1:
				PageHelper.addTextPost(title, body, category);
				break;
			case 2:
				System.out.println("URL: ");
				url = scanner.nextLine();
				PageHelper.addVideoPost(title, body, category, url);
				break;
			}
			
			System.out.println("Post " + title + " is created.");
			break;

		case 3:
			iter = PageHelper.getIterator(false);
			printOver(iter);
			
			System.out.println("Post Numarası: ");
			int postIndex = scanner.nextInt(); 
			Post post1 = (Post) PageHelper.posts.get(postIndex-1);
			System.out.println("Name: ");
			author = scanner.nextLine();
			System.out.println("Text: ");
			text = scanner.nextLine();
			
			PageHelper.addComment(author, text, post1);
			System.out.println("Your comment is added to " + post1.getTitle() + "."); 
			break;
		case 4:
			iter = PageHelper.getIterator(true);
			printOver(iter);
			break;
		case 5:
			iter = PageHelper.getIterator(false);
			printOver(iter);
			break;
		}

			
	}
	
	public static void printOver(Iterator<Page> it) {
		int i = 1;
		for (Iterator<Page> iter = it; iter.hasNext(); ) {
			System.out.println(i + ". Post\n"+ iter.next().toString() + "\n\n\n");
	        i++;
		}
	}

	

}
