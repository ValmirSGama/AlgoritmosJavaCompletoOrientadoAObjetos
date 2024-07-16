package entities;

public class Product {

	private String name;
	private Double price;
	
	// Construtor default
	public Product() {
	}

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
	
	// Método static
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	// Método que faz a mesma função do static
	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}
		
	// Método toString
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
