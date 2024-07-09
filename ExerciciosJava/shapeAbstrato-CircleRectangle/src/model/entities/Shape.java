package model.entities;

import model.enums.Color;

public abstract class Shape { 

	private Color color;
	
	// Construtor recebendo argumento "color"
	public Shape(Color color) {
		this.color = color;
	}

	// Getters e Setters
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// Método abstrato "area"
	public abstract double area();
}
