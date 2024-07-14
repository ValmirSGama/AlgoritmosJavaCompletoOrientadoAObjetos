package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Set<Product> set = new TreeSet<>(); // Quando usa o TreeSet, a Classe do conjuto tem que ser uma implentação do "Comparable" 
	 
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notbook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		    
		Product prod = new Product("Notbook", 1200.0);
	
		for(Product p : set) {
			System.out.println(p);
		}
	}
}
