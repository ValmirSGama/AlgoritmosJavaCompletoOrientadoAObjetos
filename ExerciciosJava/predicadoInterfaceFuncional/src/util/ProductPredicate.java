package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	// Método test, função que retorna um booleano
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
