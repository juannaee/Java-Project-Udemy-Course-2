package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private static DateTimeFormatter fmtd01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime datePost;
	private String titlePost;
	private String contentPost;
	private Integer likesPost;

	private List<Comments> listComments = new ArrayList<>();

	public Post() {
	}

	public Post(LocalDateTime datePost, String titlePost, String contentPost, Integer likesPost) {
		this.datePost = datePost;
		this.titlePost = titlePost;
		this.contentPost = contentPost;
		this.likesPost = likesPost;
	}

	public LocalDateTime getDatePost() {
		return datePost;
	}

	public void setDatePost(LocalDateTime datePost) {
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

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titlePost + "\n");
		sb.append(likesPost);
		sb.append(" Likes - ");
		sb.append(fmtd01.format(datePost) + "\n");
		sb.append(contentPost + "\n");
		sb.append("Comments:\n");
		for (Comments c : listComments) {
			sb.append(c.getTextComment() + "\n");
		}
		return sb.toString();
	}

}
