package blog;

public class TextPost extends Post{

	private String summary;

	public TextPost(String title, String body, String category) {
		super(title, body, category);
		if (body.length() > 10) {
			this.summary = body.substring(0, 10);
		}
	}

	@Override
	public String toString() {
		return "Summary \n" + summary + "\n\n" + getTitle() + "\n\n" + getBody()
				+ "\n\nCategory: " + getCategory() + "\nDate: " + getDate() + "\n\nComments:\n\n" + this.printComments();
	}
	
	
}
