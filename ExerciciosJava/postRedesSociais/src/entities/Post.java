package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	// Formato da data utilizado na classe.
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	
	// Atributos da classe.
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	// Lista de comentários associada ao post.
	private List<Comment> comments = new ArrayList<>();
	
	// Contrutor padrão.
	public Post() {
		
	}

	// Construtor principal para criar instâncias da classe Post.
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	// Métodos de acesso aos atributos da classe.
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	// Adiciona um comentário à lista de comentários do post.
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	// Remove um comentário da lista de comentários do post.
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	// Método toString usando do StringBuilder para representação de string do objeto.
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for(Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
