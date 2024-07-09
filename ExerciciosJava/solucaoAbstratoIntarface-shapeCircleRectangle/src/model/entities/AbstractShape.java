package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {

	// Variável do tipo Classe Enum
	private Color color;

	// Construtor com argumentos
	public AbstractShape(Color color) {
		this.color = color;
	}

	// Getters e Setters
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
