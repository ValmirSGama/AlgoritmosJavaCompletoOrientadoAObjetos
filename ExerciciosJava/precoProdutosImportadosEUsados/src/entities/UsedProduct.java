package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

	private LocalDate manufactureData;
	
	// Construtor referenciando os atributos da supercalsse e o local.
	public UsedProduct(String name, Double price, LocalDate manufactureData) {
		super(name, price);
		this.manufactureData = manufactureData;
	}

	// Métodos Getter e Setter para manipular o atributo "manufactureData".
	public LocalDate getManufactureData() {
		return manufactureData;
	}

	public void setManufactureData(LocalDate manufactureData) {
		this.manufactureData = manufactureData;
	}
	
	// Método toString.
	@Override
	public String priceTag() {
		return getName()
				+ " (used) $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufacture data: "
				+ manufactureData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
}
