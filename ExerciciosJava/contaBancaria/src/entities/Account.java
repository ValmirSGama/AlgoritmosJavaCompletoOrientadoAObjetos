package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	// Esse Account e o outro logo a seguir, constituem uma sobrecarga de construtores, a única diferença entre eles é o parâmetro "initialDeposit"
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	// Método para efetuar depósito
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	// Método para efetuar saque
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	// Método para converter um double para String através do toString
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	//Abaixo são métodos de encapsulamento Getters e Setters correspondente a necessidade de cada atributo
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
}
