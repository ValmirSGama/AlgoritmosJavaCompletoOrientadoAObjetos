package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		   // Criando uma instância de Order com um número, data e status.
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        // Exibindo a representação string do pedido.
        System.out.println(order);

        // Demonstrando o uso da enumeração OrderStatus.
        OrderStatus os1 = OrderStatus.DELIVERED;  // Usando diretamente a constante.
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");  // Obtendo um valor da enumeração pelo nome.

        // Exibindo os valores da enumeração.
		System.out.println(os1);
		System.out.println(os2);
	}

}
