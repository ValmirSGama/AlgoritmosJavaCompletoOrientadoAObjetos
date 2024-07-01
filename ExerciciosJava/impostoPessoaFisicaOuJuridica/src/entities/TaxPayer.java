package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualIncome;
	
	// Construtor padrão.
	public TaxPayer() {
	}

	// Construtor com os atributos: "name" e "anualIncome" passador por referência.
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	// Métodos Getters e Setters para manipular os atributos.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	// Método abstract tax.
	public abstract double tax();
}
