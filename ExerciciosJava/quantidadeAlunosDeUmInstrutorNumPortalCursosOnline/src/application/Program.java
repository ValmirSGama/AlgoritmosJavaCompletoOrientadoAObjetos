package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		// União de todos os conjuntos de alunos no conjunto total
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.print("Total students: " + total.size());
		
		sc.close();
	}
}
