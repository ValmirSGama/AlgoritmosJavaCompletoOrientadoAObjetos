// Pacote que contém a classe Product
package entities;

// Classe que representa um produto
public class Product {
    
    // Atributos que representam o nome, preço e quantidade em estoque do produto
    public String name;
    public double price;
    public int quantity;
    
    // Método para calcular o valor total em estoque
    public double totalValueInStock() {
        return price * quantity;
    }
    
    // Método para adicionar produtos ao estoque
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    
    // Método para remover produtos do estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    
    // Método que retorna uma representação em string do produto
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + " each, "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
