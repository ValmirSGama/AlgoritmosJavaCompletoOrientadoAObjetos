package devices;

public class ConcretePrinter extends Device implements Printer {

	// Construtor recebendo argumento para a super classe "Device"
	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	// Sobrescrevendo o método abstrato "processDoc"
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);	
	}
	
	// Implementado o contrato do método da interface "print"
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}
