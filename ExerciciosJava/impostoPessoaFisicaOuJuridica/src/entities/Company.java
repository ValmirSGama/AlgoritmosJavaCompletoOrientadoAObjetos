package entities;

public class Company extends TaxPayer{

	private Integer numberOfImployees;
	
	// Construtor padrão.
	public Company() {
	}
	
	// Construtor com os atributos: "name", "anualIncome" e "numberOfImployees" passados por referência.
	public Company(String name, Double anualIncome, Integer numberOfImployees) {
		super(name, anualIncome);
		this.numberOfImployees = numberOfImployees;
	}
	
	// Métodos Getter e Setter para manipular o atributo "numberOfImployees".
	public Integer getNumberOfImployees() {
		return numberOfImployees;
	}

	public void setNumberOfImployees(Integer numberOfImployees) {
		this.numberOfImployees = numberOfImployees;
	}

	// Sobreposição e implementação de taxa de imposto do método abstract tax.
	@Override
	public double tax() {
		if(numberOfImployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}
	
	
}
