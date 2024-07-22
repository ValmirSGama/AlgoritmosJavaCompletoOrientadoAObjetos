package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

    public static void main(String[] args) {
        // Define o local padrão como US (para entrada/saída com ponto decimal)
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        // Declara dois objetos Triangle (triângulo)
        Triangle x, y;
        
        // Instancia os objetos Triangle
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle x: ");
        
        // Atribui os valores das medidas do triângulo x a partir da entrada do usuário
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
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

        sc.close();
    }
}
