package laboratorio;

import java.time.LocalDate;
import java.time.Period;

public class Exame {

	private String nomePaciente;
	private String tipoSanguineo;
	private int anoNascimento;

	// Construtor da classe base Exame
	public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
		this.nomePaciente = nomePaciente;
		this.tipoSanguineo = tipoSanguineo;
		this.anoNascimento = anoNascimento;
	}

	// Método protegido para calcular a idade do paciente
	protected int calcularIdade() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataNascimento = LocalDate.of(anoNascimento, 1, 1);
		return Period.between(dataNascimento, dataAtual).getYears();
	}

}
