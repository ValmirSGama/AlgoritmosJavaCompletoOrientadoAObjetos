import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual será o tamanho da matriz representada por 'M' e 'N'? ");
		int m = sc.nextInt();
		int n = sc.nextInt();

		// Declaração e instanciação de uma Matriz Bidimencional.
		int[][] mat = new int[m][n];
		
		System.out.println();
		// Loop que percorre e preenche a matriz.
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Qual número da matriz você quer com os valores que o circundam? ");
		int x = sc.nextInt();

		System.out.println();
		// Loop que busca o elemento "x", os seus vizinhos e imprime-os.
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
