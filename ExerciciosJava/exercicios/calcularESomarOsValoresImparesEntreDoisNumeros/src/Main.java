import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário que insira dois números inteiros e armazena-os em 'x' e 'y'
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Encontra o valor mínimo e máximo entre 'x' e 'y'
        int min, max;
        if (x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }
        
        // Inicializa uma variável 'soma' para acumular a soma dos números ímpares entre 'min' e 'max'
        int soma = 0;
        
        // Loop para iterar por todos os números entre 'min' + 1 e 'max' - 1
        for (int i = min + 1; i < max; i++) {
            // Verifica se o número 'i' é ímpar (resto da divisão por 2 é diferente de 0)
            if (i % 2 != 0) {
                // Se 'i' for ímpar, adiciona-o à variável 'soma'
                soma = soma + i;
            }
        }
        
        // Imprime a soma dos números ímpares entre 'min' e 'max'
        System.out.println(soma);
        
        // Fecha o objeto Scanner
        sc.close();
    }
}
