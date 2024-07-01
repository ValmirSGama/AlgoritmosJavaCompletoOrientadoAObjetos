package application;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException{

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Cria e instacia uma lista de produtos.
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		// Loop para obter informações do produto.
		for (int i = 1; i <= n; i++) {
			System.out.printf("Product #%d data:\n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			// Condição que verifica qual é o produto.
			if (Character.toLowerCase(type) == 'c') {
				list.add(new Product(name, price));
			}
			else if(Character.toLowerCase(type) == 'u'){
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}

		// Imprime os valores de cada produto.
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
