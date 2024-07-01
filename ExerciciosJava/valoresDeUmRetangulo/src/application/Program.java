package application;

//Importa a classe Scanner para receber entrada do usuário
import java.util.Scanner;

//Importa a classe Rectangle do pacote 'entities'
import entities.Rectangle;

//Classe principal do programa
public class Program {

 // Método principal
 public static void main(String[] args) {
     // Cria um objeto Scanner para obter entrada do usuário
     Scanner sc = new Scanner(System.in);

     // Cria um objeto Rectangle (retângulo)
     Rectangle rect = new Rectangle();

     // Solicita ao usuário que insira a largura e a altura do retângulo
     System.out.println("Enter rectangle width and height: ");
     
     // Atribui os valores de largura e altura ao retângulo a partir da entrada do usuário
     rect.width = sc.nextDouble();
     rect.height = sc.nextDouble();

     // Exibe a área do retângulo com duas casas decimais
     System.out.printf("AREA = %.2f%n", rect.area());

     // Exibe o perímetro do retângulo com duas casas decimais
     System.out.printf("PERIMETER = %.2f%n", rect.perimeter());

     // Exibe a diagonal do retângulo com duas casas decimais
     System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

     // Fecha o Scanner para liberar recursos
     sc.close();
 }
}
