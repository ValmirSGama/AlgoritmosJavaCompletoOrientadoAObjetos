package entities;

import java.util.Objects;

public class Product {

	private String name;
	private Double price;
	
	//Construtor com argumentos
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

	// Método hashCode
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	// Método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
}
