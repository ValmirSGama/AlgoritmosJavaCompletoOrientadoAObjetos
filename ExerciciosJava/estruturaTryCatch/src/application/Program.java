package application;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		method3();
		
		System.out.println("End of program");

	}
	
	// Método 1 acionando o método 2.
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	// Método com tratamento de exceções try e catch.
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite nomes: ");
			// Vetor de Strings fazendo leitura baseado no espaço em branco.
			String[] vect = sc.nextLine().split(" ");
			System.out.println("Qual posição você quer acessar? ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); // Mostra no terminal a tragetória que desencadeou o erro.
			sc.next();
		} 
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}
	
	// Método para encontra e ler um arquivo do sistema.
	public static void method3() {
		System.out.println("***METHOD3 START***");
		// Instanciando um objeto dom tipo File.
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.hasNextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		System.out.println("***METHOD3 END***");
	}

}
