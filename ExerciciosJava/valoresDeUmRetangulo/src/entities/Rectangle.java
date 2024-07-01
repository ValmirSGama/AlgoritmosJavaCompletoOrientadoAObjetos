// Pacote que contém a classe Rectangle
package entities;

// Classe que representa um retângulo
public class Rectangle {
    
    // Atributos que representam a largura e a altura do retângulo
    public double width;
    public double height;

    // Método para calcular a área do retângulo
    public double area() {
        return width * height;
    }

    // Método para calcular o perímetro do retângulo
    public double perimeter() {
        return 2 * (width + height);
    }

    // Método para calcular a diagonal do retângulo usando as operações Matemática de Radiciação e Potenciação (Math.sqrt e Math.pow) respectivamente
    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
