package entities;

import entities.enums.Color;

public abstract class Shape {

    // Atributo do tipo "classe Color" que representa a cor da forma.
    private Color color;

    // Construtor padrão.
    public Shape() {
    }

    // Construtor com a cor como parâmetro.
    public Shape(Color color) {
        this.color = color;
    }

    // Métodos Getter e Setter para manipular o atributo color.
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Método abstrato para calcular a área da forma (a ser implementado nas classes filhas).
    public abstract double area();
}
