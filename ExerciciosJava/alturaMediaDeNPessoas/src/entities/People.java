package entities;

public class People {

	private String name;
	private int age;
	private double height;
	
	// Construtor para os campos: name, age e height
	public People(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	// Abaixo segue os Getters para acesso aos atributos
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}
	
}