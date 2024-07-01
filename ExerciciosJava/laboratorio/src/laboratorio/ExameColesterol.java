package laboratorio;

public class ExameColesterol {

	private double quantidadeLDL;
	private double quantidadeHDL;
	private char risco;

	// Construtor da classe ExameColesterol
	public ExameColesterol(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeLDL,
			double quantidadeHDL) {
		super(nomePaciente, tipoSanguineo, anoNascimento);
		this.quantidadeLDL = quantidadeLDL;
		this.quantidadeHDL = quantidadeHDL;
		calcularRisco();
	}

	// Método privado para calcular o risco com base nos níveis de HDL e LDL
	private void calcularRisco() {
		int idade = calcularIdade();

		if (idade <= 19) {
			if (quantidadeHDL > 45) {
				risco = 'B';
			} else {
				risco = 'M';
			}
		} else {
			if (quantidadeHDL > 40) {
				risco = 'B';
			} else {
				risco = 'M';
			}
		}

		if (risco == 'M') {
			if (quantidadeLDL < 100) {
				risco = 'B';
			}
		}

		if (risco == 'B') {
			if (quantidadeLDL >= 70 && quantidadeLDL < 100) {
				risco = 'M';
			} else if (quantidadeLDL >= 50 && quantidadeLDL < 70) {
				risco = 'A';
			} else if (quantidadeLDL >= 100) {
				risco = 'A';
			}
		}
	}

	// Método para mostrar o resultado do exame de colesterol
	public void MostrarResultado() {
		System.out.println("Colesterol HDL: " + quantidadeHDL + " mg/dL (Risco " + risco + ")");
		System.out.println("Colesterol LDL: " + quantidadeLDL + " mg/dL (Risco " + risco + ")");
	}

	// Método para cadastrar o resultado do exame de colesterol
	public void cadastrarExame(double quantidadeLDL, double quantidadeHDL) {
		this.quantidadeLDL = quantidadeLDL;
		this.quantidadeHDL = quantidadeHDL;
		calcularRisco();
	}
}
