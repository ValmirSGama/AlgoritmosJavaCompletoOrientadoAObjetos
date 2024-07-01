// Pacote que contém a classe Student
package entities;

// Classe que representa um aluno
public class Student {

    // Atributos que representam o nome e as notas do aluno em três avaliações
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    
    // Método para calcular a média final do aluno
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }
    
    // Método para calcular a quantidade de pontos que o aluno precisa para ser aprovado
    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
