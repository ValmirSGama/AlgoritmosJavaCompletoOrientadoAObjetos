package entities;

import entities.enums.Color;

// Classe Circle que estende a classe Shape.
public class Circle extends Shape {

    // Atributo que representa o raio do círculo.
    private Double radius;

    // Construtor padrão.
    public Circle() {
        super();
    }

    // Construtor com a cor e o raio como parâmetros.
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    // Métodos Getter e Setter para manipular o atributo.
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // Implementação do método abstrato para calcular a área do círculo.
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
