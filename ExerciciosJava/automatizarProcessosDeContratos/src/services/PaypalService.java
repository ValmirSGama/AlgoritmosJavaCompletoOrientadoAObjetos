package services;

public class PaypalService implements OnlinePaymentService {

	// Método calcula taxa de pagamento, implementado o contrato com a interface
	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}

	// Método calcula os juros, implementado o contrato com a interface
	@Override
	public double interest(double amount, int months) {
		return amount * 0.01 * months;
	}

	
}
