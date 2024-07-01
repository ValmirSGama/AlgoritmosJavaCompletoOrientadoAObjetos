package somaVetores;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário a quantidade de valores em cada vetor
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        
        // Cria três vetores de inteiros com o tamanho fornecido pelo usuário
        int [] a = new int[n];
        int [] b = new int[n];
        int [] c = new int[n];
        
        // Solicita ao usuário os valores do vetor A
        System.out.print("Digite os valores do vetor A: \n");
        
        // Loop para preencher o vetor A com valores fornecidos pelo usuário
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Solicita ao usuário os valores do vetor B
        System.out.print("Digite os valores do vetor B: \n");
        
        // Loop para preencher o vetor B com valores fornecidos pelo usuário
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        // Loop para somar os elementos correspondentes dos vetores A e B
        for(int i = 0; i < n; i++) {
            c[i] = a[i] + b[i]; 
        }
        
        // Imprime o vetor resultante (soma de A e B)
        System.out.printf("VETOR RESULTANTE: %n");

        // Loop para imprimir os elementos do vetor resultante
        for(int i = 0; i < n; i++) {
            System.out.printf("%d%n", c[i]);
        }
        
        // Fecha o objeto Scanner para evitar vazamento de recursos
        sc.close();
    }
}
