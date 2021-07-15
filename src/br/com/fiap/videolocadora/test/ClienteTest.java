package br.com.fiap.videolocadora.test;

import br.com.fiap.videolocadora.model.Cliente;

import java.util.Date;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente C3 = new Cliente();

        c1.id = 1;
        c1.nome = "Radan";
        c1.cpf = "417.622.548.32";
        c1.cartaoCredito = "4512-1223-5664-1230";
        c1.data = new Date();
        c1.alugar();

        c2.nome = "Rick";
        c2.alugar();
    }
}
