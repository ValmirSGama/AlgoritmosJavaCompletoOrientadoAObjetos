package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

	private String name;
	private String email;
	private Date bithDate;
	
	// Construtor com os atributos "name", "email" e "bithDate" passados por referência.
	public Client(String name, String email, Date bithDate){
		this.name = name;
		this.email = email;
		this.bithDate = bithDate;
	}
	
	// Métodos Getters e Setters, para acesso aos atributos.
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
	public Date getBithDate() {
		return bithDate;
	}
	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}

	// Método toString.
	@Override
	public String toString() {
		return name + " (" + sdf.format(bithDate) + ") - " + email;
	}
	
	
}
