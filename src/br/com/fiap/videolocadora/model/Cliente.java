package br.com.fiap.videolocadora.model;
import br.com.fiap.videolocadora.util.DateUtil;

import java.util.Date;

public class Cliente {
    private int id;
    private String nome;

    private String cpf;
    private String cartaoCredito;
    private int idade;
    private Date dataNascimento;


    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return DateUtil.calcularIdade(dataNascimento);
    }

    public Date getIdade() {
        // Calcular idade
        // resultado = hoje - dataNascimento = 25
        return DateUtil.calcularIdade(dataNascimento);
    }


    public void alugar() {
        System.out.println("Aluguel do cliente " + nome + " efetuado com suceesso\n");
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public boolean devolver(String filme){
        // opções de processamentos possiveis para esse método:

        // consultar se filme está mesmo alugado para aquele cliente
        // verificar se pagamento ja foi efetuado
        // alterar o status do filme para livre
        // alterar a conta do cliente para sem débito
        System.out.println("Devolvendo o Filme "+ filme);
        return true;
    }

    public String pegarPrimeiroNumeroCartaoCredito(){
         cartaoCredito.substring(0, 4);
        return cartaoCredito;
    }


}
