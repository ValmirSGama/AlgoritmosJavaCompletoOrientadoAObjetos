package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee; 

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define a localidade para o padrão dos EUA
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter full file path: ");
        String path = sc.nextLine(); 

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // Tenta abrir o arquivo e ler seu conteúdo

            List<Employee> list = new ArrayList<>(); // Cria uma lista para armazenar objetos Employee

            String line = br.readLine(); // Lê a primeira linha do arquivo
            while (line != null) { // Continua lendo enquanto houver linhas no arquivo
                String[] fields = line.split(","); // Divide a linha em campos usando vírgula como delimitador
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2]))); // Adiciona um novo Employee à lista
                line = br.readLine(); 
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream() // Cria uma stream a partir da lista de empregados
                .filter(x -> x.getSalary() > salary) // Filtra os empregados cujo salário é maior que o valor informado
                .map(x -> x.getEmail()) // Mapeia cada empregado filtrado para seu email
                .sorted() // Ordena os emails em ordem alfabética
                .collect(Collectors.toList()); // Coleta os emails em uma lista

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":"); 
            emails.forEach(System.out::println); // Imprime cada email na lista

            double sum = list.stream() // Cria uma stream a partir da lista de empregados
                .filter(x -> x.getName().charAt(0) == 'M') // Filtra os empregados cujo nome começa com 'M'
                .map(x -> x.getSalary()) // Mapeia cada empregado filtrado para seu salário
                .reduce(0.0, (x, y) -> x + y); // Soma os salários filtrados

            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum)); 

        } catch (IOException e) { // Captura exceções de entrada/saída
            System.out.println("Error: " + e.getMessage()); 
        }
        sc.close(); 
    }
}
