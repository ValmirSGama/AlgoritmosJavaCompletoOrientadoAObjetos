package entities;

import java.time.LocalDate;

public class Installment {

	private LocalDate date;
	private Double amount;
	
	// Construtor sem argumentos 
	public Installment() {
	}
	
	// Construtor com argumentos 
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	// Getters e Setters
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
