package entities;

public class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	// Construtor referenciando o atributo local e herdando o construtor da super classe Account.
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	// Método Getter e Setter para manipular o atributo interestRate.
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	// Atualiza o saudo da conta com basa na taxa de juros.
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// método para saque sobrepondo o withdrow da superclasse Account.
	@Override
	public void withdrow(double amount) {
		balance -= amount;
	}
}

