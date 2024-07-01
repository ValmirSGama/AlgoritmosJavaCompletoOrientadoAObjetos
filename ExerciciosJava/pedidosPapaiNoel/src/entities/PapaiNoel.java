package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controller.Pedido;
import controller.StatusPedido;

public class PapaiNoel {
	   private Map<String, List<Pedido>> pedidosPorCidade;

	   public PapaiNoel() {
	       this.pedidosPorCidade = new HashMap<>();
	   }

	   public void registrarPedido(Pedido pedido) {
	       String cidade = pedido.getCrianca().getCidade();
	       pedidosPorCidade.computeIfAbsent(cidade, k -> new ArrayList<>()).add(pedido);
	   }

	   public void marcarPedidoConcedido(Pedido pedido) {
	       pedido.setStatus(StatusPedido.CONCEDIDO);
	   }

	   public void imprimirPedidosConcedidosPorCidade() {
	       for (String cidade : pedidosPorCidade.keySet()) {
	           System.out.println("Pedidos concedidos em " + cidade + ":");
	           for (Pedido pedido : pedidosPorCidade.get(cidade)) {
	               if (pedido.getStatus() == StatusPedido.CONCEDIDO) {
	                   System.out.println("- " + pedido.getCrianca().getNome() + ": " + pedido.getDescricao());
	               }
	           }
	           System.out.println();
	       }
	   }
}

