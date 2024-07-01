package entities;

public class Department {

	private String name;
	
	// Contrutor padrão.
	public Department() {
		
	}

	// Contrutor com o atributo "name" passado por referência.
	public Department(String name) {
		this.name = name;
	}

	// Getter e Setter para manipular o atributo "name".
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
