package entities;

public class Rent {

	private String name;
	private String email;
	
	// Construtor padrão
	public Rent(){
	}

	// Construtor tendo name e email como parametro.
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Abaixo segue os Getters e Setters correspondentes aos atributos "name" e "email".
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//Método toString para os atributos "name" e "email".
	@Override
	public String toString() {
		return name + ", " + email;
	}
}
