import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual será o tamanho da Matriz? ");
		int n = sc.nextInt();
		
		// Declaração e instanciação de uma Matriz Bidimencional.
		int [][] mat = new int[n][n];
		
		// Loop que percorre e preenche a matriz.
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Loop que percorre a matriz imprimindo a diagonal principal.
		System.out.println("Main diagonal:");
		for(int i = 0; i < mat.length; i++) {
				System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		// Estrutura condicional repetitiva que conta os números negativos.
		int cont = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0)
				cont++;
			}
		}
		System.out.print("Negative numbers = " + cont);
		
		sc.close();

	}

}
