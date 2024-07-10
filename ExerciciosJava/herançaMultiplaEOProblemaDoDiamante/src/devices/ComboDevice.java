package devices;

public class ComboDevice extends Device implements Scanner, Printer {

	// Construtor recebendo argumento para a super classe "Device"
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	// Implementando o contrato com o método da Interface "Printer"
	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	// Implementando o contrato com o método da Interface "Scanner"
	@Override
	public String scan() {
		return "Combo scan result";
	}

	// Sobrescrevendo o método abstrato "processDoc"
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}
}
