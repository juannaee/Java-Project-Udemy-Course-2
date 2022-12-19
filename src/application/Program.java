package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comments;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmtd01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		// 21/06/2018 13:05:44
		LocalDateTime dateAux = LocalDateTime.parse("2018-06-21T13:05:44");
		dateAux.format(fmtd01);

		// primeiro post
		Comments c1 = new Comments("have a good trip !!");
		Comments c2 = new Comments("wow this is amazing!!!");

		// Segundo post
		Comments c3 = new Comments("have a good night");
		Comments c4 = new Comments("I'll talk to you tomorrow");

		Post post1 = new Post(dateAux, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

		post1.addComment(c1);
		post1.addComment(c2);
		
		System.out.println(post1);

	}

}
