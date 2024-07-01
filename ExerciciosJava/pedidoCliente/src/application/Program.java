package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

    public static void main(String[] args) throws ParseException {

        // Configuração do local padrão para definição de casa decimal com ponto.
        Locale.setDefault(Locale.US);

        // Inicialização do Scanner para entrada de dados do usuário.
        Scanner sc = new Scanner(System.in);

        // Formato da data a ser utilizado para a entrada do usuário.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Solicitação e leitura dos dados do cliente.
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        // Criação de um objeto Cliente com os dados fornecidos.
        Client client = new Client(name, email, birthDate);

        // Solicitação e leitura dos dados do pedido.
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        // Criação de um objeto Pedido com a data atual, o status e o cliente fornecidos.
        Order order = new Order(new Date(), status, client);

        // Solicitação do número de itens do pedido.
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        // Loop para a entrada dos dados de cada item do pedido.
        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter #%d item data:\n", i);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            // Criação de um objeto Produto com os dados fornecidos.
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            // Criação de um objeto Item de Pedido com os dados fornecidos.
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            // Adição do Item de Pedido ao Pedido.
            order.addItem(orderItem);
        }

        // Impressão do resumo do pedido
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        // Fechamento do Scanner.
        sc.close();
    }
}
