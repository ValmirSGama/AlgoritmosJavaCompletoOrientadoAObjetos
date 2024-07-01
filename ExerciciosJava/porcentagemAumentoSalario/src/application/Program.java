package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declaração e instanciação da Lista.
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registared? ");
		int n = sc.nextInt();
		
		// Leitura dos dados do funcionário.
		for(int i = 0; i < n; i++) {
			System.out.println("");
			System.out.printf("Employee #%d:\n", i + 1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			// Validação do id.
			while(hasId(list, id)) {
				System.out.print("Id already taken. try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			// Adicionando os dados à lista e passando os valores ao construtor. 
			list.add(new Employee(id, name, salary));
		}
		
		// Aplicando a porcentagem ao salário do funcionário.
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee em = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(em == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			em.increaseSalary(percentage);
		}
		
		// Imprimindo a lista de funcionários.
		System.out.println();
		System.out.println("List of employees:");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

	// Método hasId, verifica se o id pesquisado se encontra na lista de funcionários.
	public static boolean hasId(List<Employee> list, int id) {
		Employee em = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return em != null;
	}
}
