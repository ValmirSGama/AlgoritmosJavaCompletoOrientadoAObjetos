package application;

import controller.Pedido;
import entities.Crianca;
import entities.PapaiNoel;

public class Main {
	 public static void main(String[] args) {
	        PapaiNoel papaiNoel = new PapaiNoel();

	        // Exemplo de uso:
	        Crianca crianca1 = new Crianca("Maria", "Rua das Flores, 123", "01234-567", "São Paulo", "SP");
	        Pedido pedido1 = new Pedido(crianca1, "Boneca", 2024);
	        papaiNoel.registrarPedido(pedido1);
	        papaiNoel.marcarPedidoConcedido(pedido1);

	        Crianca crianca2 = new Crianca("João", "Avenida dos Sonhos, 456", "98765-432", "Rio de Janeiro", "RJ");
	        Pedido pedido2 = new Pedido(crianca2, "Bola", 2024);
	        papaiNoel.registrarPedido(pedido2);
	        papaiNoel.marcarPedidoConcedido(pedido2);

	        papaiNoel.imprimirPedidosConcedidosPorCidade();
	    }
}


/**
 * 1) Quando identificamos substantivos, normalmente é uma classe no sistema.

2) Quando identificamos características e adjetivos desse substantivo, eles são atributos.

3) E quando econtramos comportamentos, ou seja, os verbos e ações, normalmente são os métodos da classe.


1. Classes
Criança, rota;

2. Atributos
private String nome, endereço, cidade, estado, pedido;
private integer CEP, ano;
constantes para status pendente, concedido, negado;

3. Métodos
analiseComportamental, imprimirDados

Construtores
rota

Lista array
lista de pedidos




Analise o problema a seguir e faça um código em java que atenda os requisitos do problema.

No último natal o Papai Noel passou um trabalho muito grande para gerenciar o recebimento de cartinhas de pedidos das crianças. Todo gerenciamento era feito através de forma manual em seu caderninho de anotações. 

Ao receber a carta de uma criança, o bom velhinho registrava nome, endereço, CEP, cidade e estado da criança. Logo após, ele registrava o pedido contendo a criança solicitante, a descrição do pedido, ano do pedido e um status de controle para indicar se o pedido estava pendente, concedido ou negado.

Para definir se um pedido é atendido ou não, é feita uma analise no histórico comportamental da criança resultando concedido ou negado. Após um pedido ter sido marcado como concedido, o sistema deve prever uma ação de imprimir dados de entrega para facilitar a vida do Papai Noel.

Por fim, ele precisa também de um controle de rota no qual ele cadastra a cidade e a lista de pedidos pendentes para essa cidade. Nesse caso, no dia do natal deve imprimir a lista de pedidos concedidos por cidade para facilitar a logística.


Copilot:
Claro! Vamos analisar a estrutura do código que criamos:

1. **Classes**:
    - `Crianca`: Representa uma criança com atributos como nome, endereço, CEP, cidade e estado.
    - `Pedido`: Representa um pedido feito por uma criança, com atributos como a própria criança, descrição do pedido, ano do pedido e status.
    - `PapaiNoel`: Gerencia os pedidos e as cidades.

2. **Atributos**:
    - `Crianca`:
        - `nome`
        - `endereco`
        - `cep`
        - `cidade`
        - `estado`
    - `Pedido`:
        - `crianca` (referência a uma instância de `Crianca`)
        - `descricao`
        - `ano`
        - `status` (enum `StatusPedido`)
    - `PapaiNoel`:
        - `pedidosPorCidade` (um mapa que associa cada cidade a uma lista de pedidos)

3. **Métodos**:
    - `Crianca`:
        - Construtor para inicializar os atributos.
        - Getters e setters.
    - `Pedido`:
        - Construtor para inicializar os atributos.
        - Getters e setters.
    - `PapaiNoel`:
        - Construtor para inicializar o mapa de pedidos por cidade.
        - `registrarPedido(Pedido pedido)`: Registra um pedido na cidade correspondente.
        - `marcarPedidoConcedido(Pedido pedido)`: Marca um pedido como concedido.
        - `imprimirPedidosConcedidosPorCidade()`: Imprime os pedidos concedidos por cidade.

Em resumo, temos 3 classes, 15 atributos e 4 métodos. Claro que você pode expandir essa estrutura conforme necessário para atender aos requisitos específicos do seu projeto.
 */