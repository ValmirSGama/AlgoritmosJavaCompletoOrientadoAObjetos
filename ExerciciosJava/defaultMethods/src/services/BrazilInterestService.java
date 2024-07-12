package services;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	//Construtor com argumento
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	// Implementação do contrato com a Interface da função taxa de juros
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
