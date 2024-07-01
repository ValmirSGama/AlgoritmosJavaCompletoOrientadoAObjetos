package crescenteOuDecrescente;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			if(x < y) {
				System.out.print("Crescente");
			}
			else {
				System.out.print("Decrescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
