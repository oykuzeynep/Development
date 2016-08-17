package blog;

import java.util.ArrayList;
import java.util.List;

public abstract class Post extends Page {
	
	private List<Comment> comments = new ArrayList<>();

	public Post(String title, String body, String category) {
		super(title, body, category);
		// TODO Auto-generated constructor stub
	}
	

	public void addComment(Comment comment){
		comments.add(comment);
	}

	public StringBuilder printComments(){

		StringBuilder postComments = new StringBuilder();
		if (comments.size() == 0) {
			postComments.append("There is no comment.");
			return postComments;
		}
		
		for(Comment com: comments) {
			postComments.append(com.toString());
		}
		return postComments;
	}
	
	
	
}
