package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	// Composição com a classe Client. 
	private Client client;
	
	// Lista com a classe OrderItem passada para a coleção.
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	// Construtor padrão.
	public Order() {
	}

	// Construtor referenciando atributos, a coleção quando é para muitos não pode ser referenciada no construtor.
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	// Métodos Getters e Setters para manipular os atributos.
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	//Método para adicionar um item na lista.
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	//Método para remover um item da lista.
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	//Método para efetuar o calculo total.
	public double total() {
		double sum = 0.0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	// Método toString.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
