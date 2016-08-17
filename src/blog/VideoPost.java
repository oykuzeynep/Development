package blog;

public class VideoPost extends Post {

	private String url;

	public VideoPost(String title, String body, String category, String url) {
		super(title, body, category);
		this.url = url;
	}

	@Override
	public String toString() {
		return getTitle() + "\n\n" + getBody() + "\n\nCategory: " + getCategory() + "\nDate: " + getDate() + "\nURL: "
				+ this.url+ "\n\nComments:\n\n" + this.printComments();
	}

}
