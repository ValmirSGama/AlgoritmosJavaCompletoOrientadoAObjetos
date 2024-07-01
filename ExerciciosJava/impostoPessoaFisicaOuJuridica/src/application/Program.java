package application; 

import java.util.ArrayList; 
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company; 
import entities.Individual;
import entities.TaxPayer;

public class Program { 

    public static void main(String[] args) { 

        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: "); 
        int n = sc.nextInt(); 
        
        // Criando uma lista para armazenar objetos TaxPayer.
        List<TaxPayer> list = new ArrayList<>();

     // Loop para obter informações de cada pagador de impostos. 
        for(int i=1; i<=n; i++) { 
            System.out.printf("Tax payer #%d data:\n", i); 
            System.out.print("Individual or company (i/c)? "); 
            char ch = sc.next().charAt(0); 
            System.out.print("Name: "); 
            String name = sc.next(); 
            System.out.print("Annual income: "); 
            double annualIncome = sc.nextDouble(); 
            
            // Condição para selecionar o tipo de pessoa, pagador de impostos.
            if(ch == 'i') { 
                System.out.print("Health expenditures: "); 
                double healthExpenditures = sc.nextDouble(); 
                // Criando e adicionando um objeto "indivíduo" para a lista.
                list.add(new Individual(name, annualIncome, healthExpenditures)); 
            } else { // Se o pagador de impostos for uma compania. 
                System.out.print("Number of employees: "); 
                int numberOfEmployees = sc.nextInt(); 
                // Criando e adicionando um objeto "compania" para a list.
                list.add(new Company(name, annualIncome, numberOfEmployees)); 
            }
        }

        // Variável para armazenar o total de impostos pagos.
        double sum = 0.0; 
        System.out.println();
        System.out.println("TAXES PAID:");
        
        // loop vasculhando a lista pelos pagadores de impostos calculando o valor individual e a soma total.
        for(TaxPayer tp : list) { 
            double tax = tp.tax(); 
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax)); 
            sum += tax; 
        }

        System.out.println();
        System.out.print("TOTAL TAXES: $ " + String.format("%.2f ", sum));

        sc.close(); 
    }
}
