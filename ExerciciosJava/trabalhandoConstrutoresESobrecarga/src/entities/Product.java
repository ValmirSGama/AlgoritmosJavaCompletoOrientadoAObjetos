package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	// Construtor tendo os atributos name, price e quantity passados por referência
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Sobre carga do construtor acima
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Método de encapsulamento para pegar o valor do atributo name
	public String getName(){
		return name;
	}
	
	// Método de encapsulamento para alterar o valor do atributo name
	public void setName(String name) {
		this.name = name;
	}
	
	// Método de encapsulamento para pegar o valor do atributo price
	public double getPrice() {
		return price;
	}
	
	// Método de encapsulamento para alterar o valor do atributo price
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Método de encapsulamento para pegar o valor do atributo quantity
	public int getQuantity() {
		return quantity;
	}
	
	// Método para retornar o valor total do stock
	public double totalValueInStock() {
		return price * quantity;
	}
	
	// Método para adicionar produto no stock
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	// Método para remover produto no stock
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Método para converter objeto para String
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
