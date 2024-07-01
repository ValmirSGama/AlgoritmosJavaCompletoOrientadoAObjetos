import java.util.Locale;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		} 
		
		int somaPares = 0, nPares = 0;
		double mediaPares = 0;
		
		// Laço de repetição para selecionar e contabilizar os números pares.
		for(int i = 0; i < n; i ++) {
			if(vect[i] % 2 == 0) {
				somaPares += vect[i];
				nPares++;
			}
		}
		
		// estrutura condicional para tirar a média de pares
		if(nPares == 0) {
			System.out.print("NENHUM NUMERO PAR");
		}else {
			mediaPares += somaPares / nPares;
			System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
		}
				
		sc.close();

	}

}
