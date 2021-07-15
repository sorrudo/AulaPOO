package br.com.fiap.videolocadora.test;
import br.com.fiap.videolocadora.model.Cliente;

import java.util.Date;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Radan");
        cliente1.setCpf("417.127.528-71");
        cliente1.setCartaoCredito("4568.4257.6348.8056");

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getCartaoCredito());
    }

}
