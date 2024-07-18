package entities;

public class Product {

	private String name;
	private Double price;
	
	// Construtor com argumentos
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Método toString
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
