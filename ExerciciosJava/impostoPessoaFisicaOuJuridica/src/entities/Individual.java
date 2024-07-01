package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	// Construtor padrão.
	public Individual() {
	}
	
	// Construtor com os atributos: "name", "anualIncome" e "healthExpenditures" passados por referência.
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	// Métodos Getter e Setter para manipular o atributo "healthExpenditures".
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	// Sobreposição e implementação de taxa de imposto menos custo de saúde do método abstract tax.
	@Override
	public double tax() {
		if(getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;		}
	}
}
