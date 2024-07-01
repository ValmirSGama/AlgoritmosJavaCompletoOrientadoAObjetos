package laboratorio;

public class Main {
	public static void main(String[] args) {
		// Exemplo de uso
		ExameGlicemia exameGlicemia = new ExameGlicemia("João", "O+", 1985, 130);
		exameGlicemia.MostrarResultado();

		ExameColesterol exameColesterol = new ExameColesterol("Maria", "A-", 2000, 120, 50);
		exameColesterol.MostrarResultado();

		ExameTriglicerideos exameTriglicerideos = new ExameTriglicerideos("Carlos", "AB+", 2012, 80);
		exameTriglicerideos.MostrarResultado();
	}
}
