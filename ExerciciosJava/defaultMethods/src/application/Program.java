package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		// Instanciando um ojeto do tipo Classe e passando por parametro o valor da taxa de juros 
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " Amount: ");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}
}
