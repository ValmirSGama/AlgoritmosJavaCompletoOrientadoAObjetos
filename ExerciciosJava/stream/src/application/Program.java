package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Integer> list = Arrays.asList(3, 4, 5, 10 ,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // Criando uma Stream de String
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);// Regra de formação da seqência de fibonacci utilizando o "Stream" e o "map"		
		System.out.println(Arrays.toString(st4.limit(15).toArray())); // Armazenando os números fibonacci em um Arrays de String com limite 15 
	}
}