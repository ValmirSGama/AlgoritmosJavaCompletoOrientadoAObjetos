package entities;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	// Construtor padrão.
	public ImportedProduct() {
	}

	// Construtor referenciando os atributos da supercalsse e o local.
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	// Métodos Getters e Setters para manipular os atributos.
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// Método que calcula a taxa alfandegaria do produto.
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	// Método toString.
	@Override
	public String priceTag() {
		return getName()
				+ " $ " 
				+ String.format("%.2f", totalPrice()) 
				+ " (Costums fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}
