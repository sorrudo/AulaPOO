package br.com.fiap.videolocadora.model;

import java.util.Date;

public class Locacao {
    private int idLocacao;
    private Cliente cliente;
    private Filme filme;
    private Date dataLocacao;
    private Date dataDevolucao;
    private int telefone;
    private int quantidade;
    private double valorTotal;
    private double valorDeconto;

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorDeconto() {
        return valorDeconto;
    }

    public void setValorDeconto(double valorDeconto) {
        this.valorDeconto = valorDeconto;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }




}
