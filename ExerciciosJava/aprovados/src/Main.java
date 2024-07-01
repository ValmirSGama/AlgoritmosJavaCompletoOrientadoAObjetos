import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qnatos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String [] name = new String[n];
		double [] firstNote = new double[n];
		double [] secendNote = new double[n];
		
		// Laço de repetição para armazenar em arrays nome, primeira e segunda nota do aluno.
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d° aluno:\n", i + 1);
			sc.nextLine();
			name[i] = sc.nextLine();
			firstNote[i] = sc.nextDouble();
			secendNote[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		double media;
		// Laço de repetição para tirar a média do aluno e imprimir o nome dos aprovados na tela.
		for(int i = 0; i < n; i++) {
			media = (firstNote[i] + secendNote[i]) / 2;
			if(media >= 6.0) {
				System.out.printf("%s\n", name[i]);
			}
		}
		
		sc.close();
	}

}
