package application;

// Importa as classes Locale e Scanner para manipulação de entrada/saída
import java.util.Locale;
import java.util.Scanner;

// Importa a classe Triangle do pacote 'entities'
import entities.Triangle;

// Classe principal do programa
public class Program {

    // Método principal
    public static void main(String[] args) {
        // Define o local padrão como US (para entrada/saída com ponto decimal)
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para obter entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declara dois objetos Triangle (triângulo)
        Triangle x, y;
        
        // Instancia os objetos Triangle
        x = new Triangle();
        y = new Triangle();

        // Solicita ao usuário que insira as medidas do triângulo x
        System.out.println("Enter the measures of triangle x: ");
        
        // Atribui os valores das medidas do triângulo x a partir da entrada do usuário
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        // Solicita ao usuário que insira as medidas do triângulo y
        System.out.println("Enter the measures of triangle y: ");
        
        // Atribui os valores das medidas do triângulo y a partir da entrada do usuário
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
                
        // Calcula a área dos triângulos x e y
        double areaX = x.area();
        double areaY = y.area();
        
        // Exibe a área dos triângulos x e y com quatro casas decimais
        System.out.printf("Triangle x area: %.4f%n", areaX);
        System.out.printf("Triangle y area: %.4f%n", areaY);
        
        // Compara as áreas e exibe qual triângulo tem a maior área
        if(areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
