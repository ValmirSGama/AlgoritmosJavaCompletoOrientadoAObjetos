import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 20; // Variável tipo valor.
		
		Object obj = x; // Variável tipo referência. Aqui temos o conceito de "Boxing ou encaixotamento".
		
		System.out.println(obj);
		
		int y = (int)obj; // Aqui temos o conceito de "Unboxing ou desencaixotamento", fazendo um casting para compatibilizar os tipos das variáveis. 
		
		System.out.println(y);
		
		// Aqui o compilador não reclamou pois, "Integer é Wrapper Class de int", em outras palavras: fazem parte do mesmo pacote(tipo).
		Integer object = x; 
		
		System.out.println(object);
		
		int z = object * 2; //Tipos "Wrapper Class", não necessita de casting.
		
		System.out.println(z);
		
		sc.close();
	}

}
