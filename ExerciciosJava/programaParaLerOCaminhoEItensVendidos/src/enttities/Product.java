package enttities;

public class Product {

	private String name;
	private Double price;
	private Integer quantity;
	
	// Construtor referenciando os atributos.
	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Getters e Setters para manipular os atributos.
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


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	// Método que calcula o valor total.
	public double total() {
		return price * quantity;
	}
}
