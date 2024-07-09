package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {
	
	private Double width;
	private Double height;
	
	// Construtor recebendo argumentos
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	// Getters e Setters
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	// Sobrecrição, implementação do contrato do método "area" de acordo com a regra do retângulo
	@Override
	public double area() {
		return width * height;
	}
}
