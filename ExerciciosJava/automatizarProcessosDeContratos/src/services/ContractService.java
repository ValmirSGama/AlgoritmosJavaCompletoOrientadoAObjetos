package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	// Declaração de dependência com a Interface
	private OnlinePaymentService onlinePaymentService;

	// Declaração do construtor com argumento
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	// Método "processContract"
	public void processContract(Contract contract, int months) {
		
		// Calcula a parcela base
		double basicQuota = contract.getTotalValue() / months;
		
		// Soma os meses para definir a quantidade de parcelas
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			//Calcula o juros de cada mês
			double interest = onlinePaymentService.interest(basicQuota, i);
			
			// Calcula a taxa
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			
			// Valor cheio de cada cota
			double quota = basicQuota + interest + fee;
			
			// Instancia cada prestação/Installment e adiciona à lista de prestação do contrato
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
