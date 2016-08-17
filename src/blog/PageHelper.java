package blog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PageHelper {
	
	static List<Page> pages = new ArrayList<>();
	static List<Page> posts = new ArrayList<>();


	public static void addPage(String title, String body, String category) {
		pages.add(new Page(title, body, category));
	
	}
	
	public static void addTextPost(String title, String body, String category) {
		posts.add(new TextPost(title, body, category));
		
	}
	
	public static void addVideoPost(String title, String body, String category, String url) {
		posts.add(new VideoPost(title, body, category, url));
	}

	public static void addComment(String author, String text, Post post) {
		post.addComment(new Comment(author, text));
	}
	
	public static Iterator<Page> getIterator(boolean isPageOrPost){
		if(isPageOrPost)
		    return pages.iterator();
		return posts.iterator();
		
	}
	


}
