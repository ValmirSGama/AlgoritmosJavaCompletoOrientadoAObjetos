import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double [] tall = new double[n];
		char [] gender = new char[n];

		// Laço de repetição para ler a Altura e Genero das pessoas.
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %d° pessoa: ", i + 1);
			tall[i] = sc.nextDouble();
			System.out.printf("Genero da %d° pessoa: ", i + 1);
			gender[i] = sc.next().charAt(0);
		}

		double statureGreater = tall[0];
		double statureSmaller = tall[0];
		
		// Estrutura condicional dentro de uma de repetição para separar as pessoas de maior e menor altura.
		for(int i = 0; i < n; i++) {
			if(tall[i] > statureGreater) {
				statureGreater = tall[i];
			}
			if(tall[i] < statureSmaller) {
				statureSmaller = tall[i];
			}
		}
		
		int quantityMen = 0, quantityWomen = 0;
		double totalFemaleHeight = 0;
		
		// Estrutura condicional para verificar o gênero.
		for(int i = 0; i < n; i++) {
			if(Character.toUpperCase(gender[i]) == 'M') {
				quantityMen++;
			}
			else {
				quantityWomen++;
				totalFemaleHeight += tall[i]; 
			}
		}
		
		//Calculo para tirar a média de altura feminina.
		double averageFemaleHeight = totalFemaleHeight / quantityWomen;
		
		System.out.printf("Menor altura = %.2f\n", statureSmaller);
		System.out.printf("Maior altura = %.2f\n", statureGreater);
		System.out.printf("Media das alturas das mulheres = %.2f\n", averageFemaleHeight);
		System.out.printf("Numero de homens = %d", quantityMen);
		
		sc.close();
	}

}
