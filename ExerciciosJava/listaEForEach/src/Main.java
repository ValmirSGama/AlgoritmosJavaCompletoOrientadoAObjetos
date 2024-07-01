import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		// Declaração e instanciação de uma Lista de String
		List<String> list = new ArrayList<>();
		
		//Adicionando e removendo elementos no array Lista
		list.add("Maria");
		list.add("Marco");
		list.add("Bob");
		list.add("Anna");
		list.add("Paula");
		list.add("João");
		list.add(2, "Alex");
		list.remove(0);
		list.remove("Marco");
		
		System.out.println("Tamanho da lista: " + list.size());
		
		// For each para percorrer e imprimir os elementos da Lista
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		list.removeIf(x -> x.charAt(0) == 'J'); // Definição de uma função lambida
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		System.out.println("Index of Bod: " + list.indexOf("Bob"));
		System.out.println("Index of Maria: " + list.indexOf("Maria"));
		System.out.println("----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("Nomes que iniciam com: A");
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println("Nomes que iniciam com: J");
		System.out.println(name);
	}

}
