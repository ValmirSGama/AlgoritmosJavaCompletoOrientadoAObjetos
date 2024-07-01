package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent [] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		// Estrutura de repetição para ler os dados do locatário de um determinado quarto.
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:\n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			//Instanciação de objeto atribuindo as referências para o vetor na posição informada pelo usuário.
			vect[roomNumber] = new Rent(name, email); 
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		//Exibe os números  dos quartos e os dados dos responsáveis pelo aluguel  
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
