package br.com.fiap.videolocadora.test;
import br.com.fiap.videolocadora.model.Cliente;

import java.util.Date;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Radan");

        System.out.println(cliente1.getNome());
    }

}
