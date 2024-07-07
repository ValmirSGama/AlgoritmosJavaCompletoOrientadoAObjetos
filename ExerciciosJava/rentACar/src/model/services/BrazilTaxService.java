package model.services;

public class BrazilTaxService implements TaxService {
	
	// Método tax calcula porcentagem e cumpri o contrato com a interface TaxService
	public double tax(double amount) {
		if(amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
