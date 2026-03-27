package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa {
    // atributos
    private String nome;
    private int anoNascimento;

    // constructors (Alt+Insert)
    public Pessoa() {
    } // construtor vazio
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        setAnoNascimento(anoNascimento);
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
        try {
            LocalDate dataAtual = LocalDate.now();
            if (anoNascimento >= 950 && anoNascimento <= dataAtual.getYear()) {
                this.anoNascimento = anoNascimento;
            } else {
                throw new Exception("Valor Invalido! (min=950 ate max=AnoAtual)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // metodos particular da classe
    public int calcularIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }
}
