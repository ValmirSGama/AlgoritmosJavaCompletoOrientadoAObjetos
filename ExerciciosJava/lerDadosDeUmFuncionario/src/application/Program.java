package application;

//Importa as classes Locale e Scanner para manipulação de entrada/saída
import java.util.Locale;
import java.util.Scanner;

//Importa a classe Employee do pacote 'entities'
import entities.Employee;

//Classe principal do programa
public class Program {

 // Método principal
 public static void main(String[] args) {
     // Define o local padrão como US (para entrada/saída com ponto decimal)
     Locale.setDefault(Locale.US);
     
     // Cria um objeto Scanner para obter entrada do usuário
     Scanner sc = new Scanner(System.in);

     // Cria um objeto Employee (funcionário)
     Employee emp = new Employee();
     
     // Solicita ao usuário que insira o nome do funcionário
     System.out.print("Name: ");
     
     // Atribui o nome do funcionário a partir da entrada do usuário
     emp.name = sc.nextLine();
     
     // Solicita ao usuário que insira o salário bruto do funcionário
     System.out.print("Gross salary: ");
     
     // Atribui o salário bruto do funcionário a partir da entrada do usuário
     emp.grossSalary = sc.nextDouble();
     
     // Solicita ao usuário que insira o imposto sobre o salário do funcionário
     System.out.print("Tax: ");
     
     // Atribui o imposto sobre o salário do funcionário a partir da entrada do usuário
     emp.tax = sc.nextDouble();
     
     // Exibe uma linha em branco
     System.out.println();
     
     // Exibe os dados do funcionário
     System.out.println("Employee: " + emp);
     
     // Exibe uma linha em branco
     System.out.println();
     
     // Solicita ao usuário que insira a porcentagem de aumento salarial desejada
     System.out.print("Which percentage to increase salary? ");
     
     // Atribui a porcentagem de aumento salarial a partir da entrada do usuário
     double percentage = sc.nextDouble();
     
     // Chama o método para aumentar o salário com a porcentagem fornecida
     emp.increaseSalary(percentage);
     
     // Exibe uma linha em branco
     System.out.println();
     
     // Exibe os dados atualizados do funcionário
     System.out.println("Updated data: " + emp);
     
     // Fecha o Scanner para liberar recursos
     sc.close();
 }
}

