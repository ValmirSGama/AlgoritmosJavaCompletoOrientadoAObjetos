package entities;

public class Account {

	// Atributos com tipos wrapper class.
	private Integer number;
	private String holder;
	protected Double balance;
	
	// Construtor padrão.
	public Account() {
	}
	// Construtor referenciando os atributos "number", "holder" e balance.
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	// Métodos Getters e Setters para manipular os atributos.
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}

	// Método que realiza Saque.
	public void withdrow(double amount) {
		balance -= amount + 5.0; // Operação de Saque + taxa de Saque.
	}
	
	// Método que realiza Deposito.
	public void deposit(double amount) {
		balance += amount;
	}
}
