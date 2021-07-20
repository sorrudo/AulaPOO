package br.com.fiap.videolocadora.model;

public class Filme {
    private int idFilme;



    private String nome;
    private int anoLancamento;
    private String diretor;
    private String descricao;

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Filme(int idFilme, String nome) {
        this.idFilme = idFilme;
        this.nome = nome;
    }

}
