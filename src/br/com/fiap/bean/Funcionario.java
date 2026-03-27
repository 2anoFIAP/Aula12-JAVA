package br.com.fiap.bean;

public class Funcionario {
    //atributos
    private String nome;
    private float valorHoraTrabalho;

    // construtores
    public Funcionario() {
    }
    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        setValorHoraTrabalho(valorHoraTrabalho);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public float calcularSalario(float qtdHorasTrabalhadaSemana){
        float salario;
        salario = valorHoraTrabalho * qtdHorasTrabalhadaSemana;
        return salario * 4;
    }
}
