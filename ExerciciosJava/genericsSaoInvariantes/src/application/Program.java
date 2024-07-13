package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> mystrs = Arrays.asList("Val", "Jó", "Bob");
		printList(mystrs);
	}

	// List do tipo curiga sendo passada por parametro
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
