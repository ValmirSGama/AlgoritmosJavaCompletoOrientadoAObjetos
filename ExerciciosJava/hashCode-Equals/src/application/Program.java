package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test"; 
		String s2 = "Test"; 
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // Compara pelo conteúdo dos objetos
		System.out.println (c1 == c2); // Compara as referências de memória
		System.out.println (s1 == s2); // Quando não instanciado como "Objeto" ele dá um tratamento especial para literal
	}

}
