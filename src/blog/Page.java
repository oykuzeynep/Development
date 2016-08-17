package blog;

import java.time.LocalDate;

public class Page {

	private String title;
	private String body;
	private String category;
	private LocalDate date = LocalDate.now();
	
	
	
	public Page(String title, String body, String category) {
		super();
		this.title = title;
		this.body = body;
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getDate() {
		return date;
	}

	@Override
	public String toString() {
		return title + "\n\n\n" + body + "\n\nCategory:" + category + "\nDate: " + date;
	}
	
	
	
	
	
	
	
}
