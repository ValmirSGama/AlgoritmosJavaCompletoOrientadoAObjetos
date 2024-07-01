import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String [] name = new String[n];
		int [] age = new int[n];
		
		// Laço de repetição para ler Nome e Idade da pessoa.
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %d° pessoa:\n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
		}
		
		int older = 0, highestPosition = 0;
		
		// Laço de repetição para selecionar a pessoa de maior idade.
		for(int i = 0; i < n; i++) {
			if(age[i] > older) {
				older = age[i];
				highestPosition = i;
			}
			
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", name[highestPosition]);
		
		sc.close();
	}

}
