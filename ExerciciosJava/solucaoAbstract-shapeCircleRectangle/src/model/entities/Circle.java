package model.entities;

import model.enums.Color;

public class Circle extends Shape {

	private Double radius;
	
	// Construtor recebendo argumentos
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	// Getters e Setters
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	// Sobrecrição do método abstrato "area" de acordo com a regra do circulo
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
