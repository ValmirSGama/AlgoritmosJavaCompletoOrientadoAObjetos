package devices;

public class ConcreteScanner extends Device implements Scanner {

	// Construtor recebendo argumento para a super classe "Device"
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	// Sobrescrevendo o método abstrato "processDoc"
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	// Implementado o contrato do método da interface "scan"
	@Override
	public String scan() {
		return "Scanner content";
	}
}
