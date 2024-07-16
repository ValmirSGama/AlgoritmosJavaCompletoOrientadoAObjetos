package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1; // Valor de atualização de preço que pode ser lida pelo usuário

		// Expressão lambda inline no consumer
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		// Usando um reference method para o println no consumer
		list.forEach(System.out::println);
	}
}
