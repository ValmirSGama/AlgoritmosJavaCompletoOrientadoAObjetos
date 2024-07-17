package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String> {

	// Método apply retornando os nomes em caixa alta
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}