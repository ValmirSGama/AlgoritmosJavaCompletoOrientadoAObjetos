package entities;

public class Employee {

	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	// Construtor padrão.
	public Employee() {
	}

	// Construtor recebendo os atributos "name", "hours" e "valuePerHour".
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	// Métodos Getters e Setters para manipular os atributos.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	// Métodos que calcula o pagamento do funcionário.
	public double payment() {
		return hours * valuePerHour;
	}
}
