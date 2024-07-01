import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros você vai digitar? ");
        // Lê a quantidade de números a serem digitados
        int n = sc.nextInt();
        // Cria um vetor de inteiros com o tamanho fornecido pelo usuário
        int [] vect = new int[n];
        
        // Loop para preencher o vetor com números fornecidos pelo usuário
        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        // Imprime cabeçalho indicando a seção de números pares
        System.out.print("\nNUMEROS PARES:\n");
        
        // Inicializa a variável qtd para contar a quantidade de números pares
        int qtd = 0;
        
        // Loop para verificar e imprimir os números pares do vetor
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                qtd++; // Incrementa a contagem de números pares
            }
        }
        
        // Imprime a quantidade total de números pares
        System.out.print("\n\nQUANTIDADE DE PARES = " + qtd);
        
        // Fecha o objeto Scanner para evitar vazamento de recursos
        sc.close();
    }
}
