package entities;

public class Rectangle implements Shape {

	private double width;
	private double height;
	
	// Construtor recebendo argumentos
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Getters e Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Implementação do método abstrato "area" de acordo com a regra do retângulo
	@Override
	public double area() {
		return width * height;
	}
}