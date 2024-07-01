package application;
//Importa as classes Locale e Scanner para manipulação de entrada/saída
import java.util.Locale;
import java.util.Scanner;

//Importa a classe Student do pacote 'entities'
import entities.Student;

//Classe principal do programa
public class Program {

 // Método principal
 public static void main(String[] args) {
     // Define o local padrão como US (para entrada/saída com ponto decimal)
     Locale.setDefault(Locale.US);
     
     // Cria um objeto Scanner para obter entrada do usuário
     Scanner sc = new Scanner(System.in);

     // Cria um objeto Student (aluno)
     Student stu = new Student();
     
     // Solicita ao usuário que insira o nome do aluno
     stu.name = sc.nextLine();
     
     // Solicita ao usuário que insira a nota da primeira avaliação
     stu.grade1 = sc.nextDouble();
     
     // Solicita ao usuário que insira a nota da segunda avaliação
     stu.grade2 = sc.nextDouble();
     
     // Solicita ao usuário que insira a nota da terceira avaliação
     stu.grade3 = sc.nextDouble();
     
     // Exibe a média final do aluno
     System.out.printf("FINAL GRADE = %.2f%n", stu.finalGrade());
     
     // Verifica se o aluno foi aprovado ou reprovado
     if (stu.finalGrade() < 60.0) {
         System.out.println("FAILED");
         
         // Exibe a quantidade de pontos que o aluno precisa para ser aprovado
         System.out.printf("MISSING %.2f POINTS%n", stu.missingPoints());
     } else {
         System.out.println("PASS");
     }
     
     // Fecha o Scanner para liberar recursos
     sc.close();
 }
}
