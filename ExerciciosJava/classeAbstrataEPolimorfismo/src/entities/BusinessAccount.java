package entities;

public class BusinessAccount extends Account{

	 private Double loanLimit;
	 
	// Construtor padrão.
	 public BusinessAccount() {
		 super();
	 }

	 // Construtor referenciando o atributo local e herdando o construtor da super classe Account.
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	// Método Getter e Setter para manipular o atributo loanLimit.
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	 
	// Método condicionado ao limite de empréstimo.
	 public void loan(double amount) {
		 if(amount <= loanLimit)
		 balance += amount - 10.0; // Operação de depósito - taxa de empréstimo.
	 }
	 
	// Sobreposição do método withdrow da superclasse Account.
	@Override
	public void withdrow(double amount) {
		super.withdrow(amount);
		balance -= 2.0;
	}
}
