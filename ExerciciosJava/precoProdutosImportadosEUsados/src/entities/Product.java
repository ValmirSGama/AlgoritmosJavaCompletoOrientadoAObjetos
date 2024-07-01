package entities;

public class Product {

	private String name;
	private Double price;
	
	// Construtor padrão.
	public Product() {
	}

	// Construtor referenciando os atributos "name" e "price".
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// Métodos Getters e Setters para manipular os atributos.
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

	// Método toString.
	public String priceTag() {
		return name
				+ " $ "
				+ String.format("%.2f", price);
	}
}
