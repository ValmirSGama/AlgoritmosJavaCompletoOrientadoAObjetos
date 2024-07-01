package laboratorio;

public class ExameTriglicerideos {

	private double quantidadeTriglicerideos;

	// Construtor da classe ExameTriglicerideos
	public ExameTriglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento,
			double quantidadeTriglicerideos) {
		super(nomePaciente, tipoSanguineo, anoNascimento);
		this.quantidadeTriglicerideos = quantidadeTriglicerideos;
	}

	// Método para classificar o resultado dos triglicerídeos
	public void classificarResultado() {
		int idade = calcularIdade();
		String faixaEtaria;

		if (idade < 10) {
			faixaEtaria = "De 0 a 9 anos";
		} else if (idade >= 10 && idade < 20) {
			faixaEtaria = "De 10 a 19 anos";
		} else {
			faixaEtaria = "Acima de 20 anos";
		}

		if (faixaEtaria.equals("De 0 a 9 anos") && quantidadeTriglicerideos < 75) {
			System.out.println("Com Jejum: inferior a 75 mg/dL");
		} else if (faixaEtaria.equals("De 10 a 19 anos") && quantidadeTriglicerideos < 90) {
			System.out.println("Com Jejum: inferior a 90 mg/dL");
		} else if (faixaEtaria.equals("Acima de 20 anos") && quantidadeTriglicerideos < 150) {
			System.out.println("Com Jejum: inferior a 150 mg/dL");
		}
	}

	// Método para mostrar o resultado do exame de triglicerídeos
	public void MostrarResultado() {
		System.out.println("Triglicerídeos: " + quantidadeTriglicerideos + " mg/dL");
		classificarResultado();
	}

	// Método para cadastrar o resultado do exame de triglicerídeos
	public void cadastrarExame(double quantidadeTriglicerideos) {
		this.quantidadeTriglicerideos = quantidadeTriglicerideos;
	}

}
