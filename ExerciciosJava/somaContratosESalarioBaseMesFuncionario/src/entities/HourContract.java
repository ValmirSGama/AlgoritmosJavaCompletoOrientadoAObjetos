package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	// Construtor padrão.
	public HourContract() {
		
	}

	// Construtor tendo os atributos "date", "valuePerHour" e "hours" por referência.
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	// Getters e Setters para manipulação dos atributos
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	// Método multiplicador do valor vezes hora trabalhada.
	public double totalValue() {
		return valuePerHour * hours;
	}
}
