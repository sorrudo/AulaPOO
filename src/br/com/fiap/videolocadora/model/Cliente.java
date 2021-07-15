package br.com.fiap.videolocadora.model;

import java.util.Date;

public class Cliente {
    public int id;
    public String nome;
    public String cpf;
    public String cartaoCredito;
    public Date data;

    public void alugar() {
        System.out.println("Aluguel do cliente " + nome + " efetuado com suceesso\n");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }
}
