package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	// Declação statica, será compartilhado com todos os "Installment"
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

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

	// Método toString 
	@Override
	public String toString() {
		return date.format(fmt) + " - " + String.format("%.2f", amount);
	}
}
