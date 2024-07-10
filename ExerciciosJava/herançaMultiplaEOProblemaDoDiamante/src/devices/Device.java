package devices;

public abstract class Device {

	public String serialNumber;
	
	// Construtor recebendo argumento
	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// Getters e Setters
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// Método abstrato processDoc
	public abstract void processDoc(String doc);
}
