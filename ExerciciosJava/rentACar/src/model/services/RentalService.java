package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	// Dependência da Classe "RentalService" com a Interface "TaxService"
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	// Método gerar fatura do carRental
	public void processInvoice(CarRental carRental) {
		
		// Encontra a duração entre dois instantes de tempo e converte para minutos
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0; // Encontra o número de horas em fração
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours); // Pega a fração de horas arredonda para cima e multiplica pelo preço por hora 
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0); // Pega a fração de horas arredonda para cima, divide por 24h e multiplica pelo preço por dia 
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
