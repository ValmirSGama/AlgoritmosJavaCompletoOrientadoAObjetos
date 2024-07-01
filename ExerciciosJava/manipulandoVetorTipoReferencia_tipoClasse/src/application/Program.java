package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("De quantos produtos você quer a média? ");
		int n = sc.nextInt(); // A quebra de linha está pendente
		Product[] vect = new Product[n]; 
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine(); // Consumindo a quebra de linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = $ %.2f%n", avg);
		
		sc.close();

	}

}
