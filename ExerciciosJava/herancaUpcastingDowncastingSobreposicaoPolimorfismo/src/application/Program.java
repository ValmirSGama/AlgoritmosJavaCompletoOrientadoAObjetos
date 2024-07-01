package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//Instanciando uma variável acc do tipo "class Account" e passando valores nos argumentos.
		Account acc = new Account(1001, "Alex", 0.0);
		//Instanciando uma variável bacc do tipo "class BusinessAccount" e passando valores nos argumentos.
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// Exemplo de polimorfismo.
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdrow(50.0);
		y.withdrow(50.0);
		System.out.println("Exemplo de polimorfismo");
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		// Exemplo de chamada do método Saque, "classe Account", com valor da taxa de Saque. 
		Account accSaque = new Account(1001, "Alex", 1000.0);
		accSaque.withdrow(200.0);
		System.out.println("Método Account com valor da taxa de Saque");
		System.out.println(accSaque.getBalance());
		
		// Exemplo de chamada do método sobreposto sem a taxa de Saque da classe SavingsAccount. 
		Account accSobreposto = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		accSobreposto.withdrow(200.0);
		System.out.println("Método sobreposto SavingsAccount sem a taxa de Saque");
		System.out.println(accSobreposto.getBalance());
		
		// Exemplo de chamada do método sobreposto com taxa de Saque da classe BusinessAccount. 
		Account accSobreposicao = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		accSobreposicao.withdrow(200.0);
		System.out.println("Método sobreposto BusinessAccount com a taxa de Saque");
		System.out.println(accSobreposicao.getBalance());
		
		// UPCASTINHG
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTINHG
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		System.out.println("Estrutura condicional");
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
