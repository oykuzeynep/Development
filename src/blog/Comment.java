package blog;

import java.time.LocalDate;
import java.util.Date;

public class Comment {

	private String author;
	private String text;
	private LocalDate date = LocalDate.now();
	
	public Comment(String author, String text) {
		super();
		this.author = author;
		this.text = text;
	}

	@Override
	public String toString() {
		return "Author: " + author + "\n" + text + "\n\nDate: " + date;
	}
	
	
	
	
	
}
