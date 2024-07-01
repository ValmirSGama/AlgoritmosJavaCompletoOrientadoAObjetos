package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;

	// Construtor referenciando os atributos também da superclasse.
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	// Métodos de pagamento do funcionário terceirizado.
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
