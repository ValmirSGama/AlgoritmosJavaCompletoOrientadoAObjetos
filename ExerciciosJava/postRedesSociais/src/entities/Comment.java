package entities;

public class Comment {

	// Atributo que armazena o texto do comentário.
	private String text;
	
	// Construtor padrão.
	public Comment() {
		
	}

	// Construtor principal para criar instâncias da classe Comment com texto.
	public Comment(String text) {
		this.text = text;
	}

	// Método de acesso ao texto do comentário.
	public String getText() {
		return text;
	}

	// Método para modificar o texto do comentário.
	public void setText(String text) {
		this.text = text;
	}
}
