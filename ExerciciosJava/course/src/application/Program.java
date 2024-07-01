package application;

// Importa as classes Locale e Scanner para manipulação de entrada/saída
import java.util.Locale;
import java.util.Scanner;

// Importa a classe Product do pacote 'entities'
import entities.Product;

// Classe principal do programa
public class Program {

    // Método principal
    public static void main(String[] args) {
        // Define o local padrão como US (para entrada/saída com ponto decimal)
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para obter entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Cria um objeto Product (produto)
        Product product = new Product();
        
        // Solicita ao usuário que insira os dados do produto
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        
        // Atribui o nome do produto a partir da entrada do usuário
        product.name = sc.nextLine();
        
        System.out.print("Price: ");
        
        // Atribui o preço do produto a partir da entrada do usuário
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        
        // Atribui a quantidade em estoque do produto a partir da entrada do usuário
        product.quantity = sc.nextInt();
        
        // Exibe os dados do produto
        System.out.println();
        System.out.println("Product data: " + product);

        // Solicita ao usuário que insira a quantidade de produtos a serem adicionados ao estoque
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        
        // Adiciona a quantidade especificada de produtos ao estoque
        product.addProducts(quantity);
        
        // Exibe os dados atualizados do produto
        System.out.println();
        System.out.println("Updated data: " + product);

        // Solicita ao usuário que insira a quantidade de produtos a serem removidos do estoque
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        
        // Remove a quantidade especificada de produtos do estoque
        product.removeProducts(quantity);

        // Exibe os dados atualizados do produto
        System.out.println();
        System.out.println("Updated data: " + product);
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
