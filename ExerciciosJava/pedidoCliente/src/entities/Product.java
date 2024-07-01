package entities;

public class Product {

	private String name;
	private Double price;
	
	// Construtor com os atributos "name" e "price" passados por referência.
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Métodos de acesso aos atributos name e price.
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
}
