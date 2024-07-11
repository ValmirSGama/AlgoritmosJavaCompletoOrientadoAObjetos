package entities;

public class Employee implements Comparable<Employee> { // Interface comparable, define como que um objeto é comparado a outro

	private String name;
	private Double salary;
	
	// Construtor com argumentos
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Implemtação do contrato "compareTo" 
	@Override
	public int compareTo(Employee other) {
		return -salary.compareTo(other.getSalary()); // Ordena por salários de forma Crescente
	}
	
	// Outras possibilidades pro "compareTo"
	/**
	@Override
	public int compareTo(Employee other) {
		return salary.compareTo(other.getSalary()); // Ordena por salários de forma decrescente
	}*/
	
	/**
 	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName()); // Ordena por nomes
	}*/	 
}
