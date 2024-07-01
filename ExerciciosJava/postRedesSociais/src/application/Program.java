package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// Formato de data utilizado no programa.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		
		// Criando instâncias de Comment para o primeiro post.
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		// Criando instância de Post e adicionando os comentários.
		Post p1 = new Post(
				sdf.parse("27/12/2023 16:48:30"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);

		// Criando instâncias de Comment para o segundo post.
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		
		// Criando instância de Post e adicionando os comentários.
		Post p2 = new Post(
				sdf.parse("33/01/2024 12:08:38"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		// Exibindo os posts.
		System.out.println(p1);
		System.out.println(p2);
	}
}
