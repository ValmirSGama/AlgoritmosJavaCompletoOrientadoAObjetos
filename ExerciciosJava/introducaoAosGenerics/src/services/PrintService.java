package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { // Classe genérica do tipo "T" a ser parametrizada

	// Instanciando uma lista genérica
	private List<T> list = new ArrayList<>();
	
	// Método para adicionar valor à lista
	public void addValue(T value) {
		list.add(value);
	}
	
	// Método para retornar o primeiro elemento da lista
	public T first() {
		if(list.isEmpty()) { // Programação defenciva
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	// Método para printar os valores da lista
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
