import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] vect = new String[] {"Maria", "Bob", "Alex"};
		
		// Exemplo laço de repetição for
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------");
		
		// Exemplo laço de repetição for each
		for(String obj : vect) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
