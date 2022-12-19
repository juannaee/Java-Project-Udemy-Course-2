package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private Instant datePost;
	private String titlePost;
	private String contentPost;
	private Integer likesPost;

	private List<Comments> listComments = new ArrayList<>();

	public Post() {
	}

	public Post(Instant datePost, String titlePost, String contentPost, Integer likesPost) {
		this.datePost = datePost;
		this.titlePost = titlePost;
		this.contentPost = contentPost;
		this.likesPost = likesPost;
	}

	public Instant getDatePost() {
		return datePost;
	}

	public void setDatePost(Instant datePost) {
		this.datePost = datePost;
	}

	public String getTitlePost() {
		return titlePost;
	}

	public void setTitlePost(String titlePost) {
		this.titlePost = titlePost;
	}

	public String getContentPost() {
		return contentPost;
	}

	public void setContentPost(String contentPost) {
		this.contentPost = contentPost;
	}

	public Integer getLikesPost() {
		return likesPost;
	}

	public void setLikesPost(Integer likesPost) {
		this.likesPost = likesPost;
	}

	public List<Comments> getListComments() {
		return listComments;
	}

	public void addComment(Comments comment) {
		listComments.add(comment);
	}

	public void removeComment(Comments comment) {
		listComments.remove(comment);
	}

}
