package entities;

public class Circle implements Shape {

	private double radius;

	// Construtor recebendo argumentos
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// Getters e Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Implementação do método abstrato "area" de acordo com a regra do circulo
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}