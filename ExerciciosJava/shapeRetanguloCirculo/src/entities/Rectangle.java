package entities;

import entities.enums.Color;

// Classe Rectangle que estende a classe Shape.
public class Rectangle extends Shape {

    // Atributos que representam a largura e a altura do retângulo.
    private Double width;
    private Double height;

    // Construtor padrão.
    public Rectangle() {
        super();
    }

    // Construtor com a cor, largura e altura como parâmetros.
    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Métodos Getters e Setters para obter e definir os atributos.
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    // Implementação do método abstrato para calcular a área do retângulo.
    @Override
    public double area() {
        return width * height;
    }

}
