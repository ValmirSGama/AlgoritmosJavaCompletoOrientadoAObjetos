package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		People[] pe = new People[n];
		
		// Leitura dos dados das pessoas 
		for(int i = 0; i < pe.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			pe[i] = new People(name, age, height);
		}
		
		double sum = 0.0;
		int cont = 0;
		
		// Condição para quantas pessoas com menos de 16 anos e a média das alturas
		for(int i = 0; i < pe.length; i++) {
			if(pe[i].getAge() < 16) {
				cont++; // Outra possível representação "cont += 1;" ou "cont = cont + 1;"
			}
			sum += pe[i].getHeight();
		}
		double percent = cont * 100.0 / n;
		double mediumHeight = sum / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediumHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent); // Os primeiros "%%" depois do "f" imprime um "%" na tela, o ultimo "%n" pula uma linha
		
		// Condição que exibe o nome das pessoas com menos de 16 anos
		for(int i = 0; i < pe.length; i++) {
			if(pe[i].getAge() < 16) {
				System.out.println(pe[i].getName());
			}
		}
		
		sc.close();
	}

}
