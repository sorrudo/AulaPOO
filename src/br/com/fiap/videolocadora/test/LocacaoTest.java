package br.com.fiap.videolocadora.test;

import br.com.fiap.videolocadora.model.Cliente;
import br.com.fiap.videolocadora.model.Filme;
import br.com.fiap.videolocadora.model.Locacao;
import br.com.fiap.videolocadora.util.DateUtil;

import java.util.Date;

public class LocacaoTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Filme filme = new Filme(1, "O sortudo");
        Locacao locacao = new Locacao();
        locacao.setDataLocacao(DateUtil.stringToDate("19/07/2021"));
        locacao.setDataDevolucao(DateUtil.stringToDate("05/08/2021"));
        locacao.setValorTotal(20.80);
        locacao.setValorDeconto(0.50);
        locacao.setCliente(cliente);
        locacao.setFilme(filme);
        System.out.println(locacao);
    }
}
