import java.util.Locale;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        
        // Configura o programa para utilizar o ponto como separador decimal
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário a quantidade de elementos no vetor
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        // Cria um vetor de double com o tamanho fornecido pelo usuário
        double [] vect = new double[n];
        
        // Inicializa a variável soma, que será usada para calcular a média
        double soma = 0;
        // Loop para preencher o vetor e calcular a soma dos elementos
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        
        // Calcula a média dos elementos do vetor
        double media = soma / n;
        
        System.out.printf("\nMEDIA DO VETOR = %.3f", media);  // Imprime a média com três casas decimais
        System.out.printf("\nELEMENTOS ABAIXO DA MEDIA =\n");
        
        // Loop para imprimir os elementos abaixo da média
        for(int i = 0; i < n; i++) {
            if(vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }
        
        // Fecha o objeto Scanner para evitar vazamento de recursos
        sc.close();
    }
}

