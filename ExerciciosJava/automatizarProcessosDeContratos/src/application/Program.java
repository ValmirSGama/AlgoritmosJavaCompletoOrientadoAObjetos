package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Formatação da data
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		System.out.println("Entre os dados do cadastro:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		// Instanciando o "Contract" e passando variáveis como argumento
		Contract obj = new Contract(number, date, totalValue); 
		
		System.out.print("Entre com o numero de parcelas:");
		int n = sc.nextInt();
		
		// Instanciando "ContractService" recebendo como argumento "PaypalService"
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, n); 
		
		System.out.println("Parcelas: ");
		for(Installment installment : obj.getInstallments()) { // For para percorrer cada "obj/parcela"
			System.out.println(installment);
		}
		
		sc.close();
	}

}