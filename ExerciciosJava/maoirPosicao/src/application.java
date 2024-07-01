import java.util.Locale;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        
        // Configura o programa para utilizar o ponto como separador decimal
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        int n, posMaior; 
        double maior;
        
        // Solicita ao usuário a quantidade de números a serem digitados
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        // Cria um vetor de double com o tamanho fornecido pelo usuário
        double [] vect = new double[n];
        
        // Loop para preencher o vetor com números fornecidos pelo usuário
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        
        // Inicializa variáveis para armazenar o maior valor e sua posição
        posMaior = 0;
        maior = 0;
        
        // Loop para encontrar o maior valor e sua posição no vetor
        for(int i = 0; i < n; i++) {
            if(vect[i] > maior) {
                maior = vect[i];
                posMaior = i;
            }
        }

        // Imprime o maior valor com uma casa decimal
        System.out.printf("\nMAIOR VALOR = %.1f", maior);
        // Imprime a posição do maior valor do vetor
        System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posMaior);
        
        // Fecha o objeto Scanner para evitar vazamento de recursos
        sc.close();
    }
}
