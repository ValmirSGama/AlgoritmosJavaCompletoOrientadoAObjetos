package entities;

public class Product implements Comparable<Product> {

	private String name;
	private Double price;
	
	// Contrutor com argumentos
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

	// comparando o preço de um produto com outro no argumento
	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}
}
