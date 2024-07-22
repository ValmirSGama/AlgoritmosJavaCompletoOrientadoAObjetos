package entities;

public class Triangle {
    
    // Atributos que representam os lados do triângulo
    public double a;
    public double b;
    public double c;
    
    // Método para calcular a área do triângulo usando a fórmula de Heron
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
    }
}
