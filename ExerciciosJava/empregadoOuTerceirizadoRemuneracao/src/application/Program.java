package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Cria uma lista de funcionários (pode conter tanto funcionários normais quanto terceirizados).
		List<Employee> list = new ArrayList<>();
		
		// Solicita o número de funcionários.
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		
		// Loop para obter informações de cada funcionário.
		for(int i=1; i<=n; i++) {
			System.out.printf("Employee #%d data: \n", i);
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			// Verifica se o funcionário é terceirizado.
			if(Character.toLowerCase(ch) == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// Adiciona um funcionário terceirizado à lista.
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				// Adiciona um funcionário normal à lista.
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		// Imprime os pagamentos de cada funcionário.
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}

}

