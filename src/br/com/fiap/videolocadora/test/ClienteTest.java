package br.com.fiap.videolocadora.test;
import br.com.fiap.videolocadora.model.Cliente;
import br.com.fiap.videolocadora.util.DateUtil;


public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.setNome("Radam");
        cliente1.setCpf("417.127.528-71");
        cliente1.setCartaoCredito("4568.4257.6348.8056");
        String nomeFilme = "Estrelas além do tempo";
        cliente1.setDataNascimento(DateUtil.stringToDate("02/01/1998"));


        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getCartaoCredito());
        System.out.println(cliente1.pegarPrimeiroNumeroCartaoCredito());
        System.out.println(cliente1.devolver(nomeFilme));

        System.out.println(cliente1.getIdade());

    }

}
