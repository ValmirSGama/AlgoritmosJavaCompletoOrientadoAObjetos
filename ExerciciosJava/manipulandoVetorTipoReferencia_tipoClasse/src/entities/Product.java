package entities;

public class Product {
	
	private String name;
	private double price;

	// Construtor Product tendo "name" e "price" como parametro
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Abaixo são os Getters e Setters para acesso e configuração respectivamente dos atributos "name" e "price" 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
