package laboratorio;

public class ExameGlicemia {

	private double quantidadeGlicose;

	// Construtor da classe ExameGlicemia
	public ExameGlicemia(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeGlicose) {
		super(nomePaciente, tipoSanguineo, anoNascimento);
		this.quantidadeGlicose = quantidadeGlicose;
	}

	// Método para classificar o resultado da glicemia
	public void classificarResultado() {
		if (quantidadeGlicose < 100) {
			System.out.println("Normoglicemia");
		} else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126) {
			System.out.println("Pré-diabetes");
		} else {
			System.out.println("Diabetes estabelecido");
		}
	}

	// Método para mostrar o resultado do exame de glicemia
	public void MostrarResultado() {
		System.out.println("Glicemia: " + quantidadeGlicose + " mg/dL");
		classificarResultado();
	}

	// Método para cadastrar o resultado do exame de glicemia
	public void cadastrarExame(double quantidadeGlicose) {
		this.quantidadeGlicose = quantidadeGlicose;
	}

}
