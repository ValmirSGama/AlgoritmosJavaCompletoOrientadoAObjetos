// Pacote que contém a classe Employee
package entities;

// Classe que representa um funcionário
public class Employee {
    
    // Atributos que representam o nome, salário bruto e imposto sobre o salário do funcionário
    public String name;
    public double grossSalary;
    public double tax;
    
    // Método para calcular o salário líquido (salário bruto - imposto)
    public double netSalary() {
        return grossSalary - tax;
    }
    
    // Método para aumentar o salário com base em uma porcentagem
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0; 
    }
    
    // Método que retorna uma representação em string do funcionário
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
