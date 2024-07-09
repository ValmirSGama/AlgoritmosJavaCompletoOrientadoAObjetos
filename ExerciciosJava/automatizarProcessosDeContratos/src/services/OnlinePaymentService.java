package services;

public interface OnlinePaymentService {

	// Métodos como contrato a ser implementado
	double paymentFee(double amount);
	double interest(double amount, int months);
}
