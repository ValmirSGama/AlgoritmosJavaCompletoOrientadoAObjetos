package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));
		
		double min = 100.0; // valor para ser parametrizado na função lâmbida, vantagem que pode ser definida pelo usuário 
		
		// Expressão lâmbida recebendo como predicado uma função anônima
		Predicate<Product> pred = p -> p.getPrice() >= min;
		
		// Lista recebendo como referência a variável pred
		list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
