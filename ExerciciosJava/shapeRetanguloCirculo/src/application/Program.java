package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // Cria uma lista para armazenar as formas.
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        // Loop para criar cada forma.
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data");
            System.out.print("Rectangle or Circle (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            // Condição para escolher Retângulo (r) ou Círculo (c) e coletar os dados correspondentes.
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                // Cria e adiciona um objeto Rectangle à lista.
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                // Cria e adiciona um objeto Circle à lista.
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();

        // Imprime as áreas de todas as formas da lista.
        System.out.println("SHAPE AREA:");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
