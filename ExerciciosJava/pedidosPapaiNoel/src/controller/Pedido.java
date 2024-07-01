package controller;

import entities.Crianca;

public class Pedido {
    private Crianca crianca;
    private String descricao;
    private int ano;
    private StatusPedido status;

    public Pedido(Crianca crianca, String descricao, int ano) {
        this.crianca = crianca;
        this.descricao = descricao;
        this.ano = ano;
        this.status = StatusPedido.PENDENTE;
    }

    // Getters 
    public Crianca getCrianca() {
        return crianca;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAno() {
        return ano;
    }

    public StatusPedido getStatus() {
        return status;
    }

    // Setters
    public void setCrianca(Crianca crianca) {
        this.crianca = crianca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
