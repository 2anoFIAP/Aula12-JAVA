package br.com.fiap.bean;

public class Pessoa {
    // atributos
    private String nome;
    private int anoNascimento;

    // constructors (Alt+Insert)
    public Pessoa() {
    } // construtor vazio
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    } // construtor com passagem de parametro

    // métodos getters e setters (Alt+Insert)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // metodos particular da classe
    public int calcularIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }
}
