package br.com.fiap.videolocadora.test;

import br.com.fiap.videolocadora.model.Cliente;

import javax.swing.*;
import java.util.Date;

public class ClienteConstrutorTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("radan");
        cliente.setCpf("417.622.548-32");
        cliente.setCartaoCredito("1234-6548-6542-3154");
        cliente.setDataNascimento(new Date());

    }
}
