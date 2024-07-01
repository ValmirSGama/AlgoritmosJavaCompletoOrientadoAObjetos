package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	// Composição com a classe Product.
	private Product product;
	
	// Construtor padão.
	public OrderItem() {
	}
	// Construtor tento os atributos passados por referência.
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	// Getters e Setters dos referentes atributos.
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	// Método que calcula o subtotal de um produto.
	public double subTotal() {
		return price * quantity;
	}
	
	// Método toString.
	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: " 
				+ quantity
				+ ", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
