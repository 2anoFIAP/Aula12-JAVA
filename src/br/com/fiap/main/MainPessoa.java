package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); // construtor vazio
        pessoa1.setNome("Sukuna");
        pessoa1.setAnoNascimento(971);
        int idade = pessoa1.calcularIdade(2026);

        Pessoa pessoa2 = new Pessoa("Satoru Gojo", 1999); // construtor com passagem de parametro

        System.out.printf("Nome: %s\nIdade: %d anos\n", pessoa1.getNome(), idade);
        System.out.printf("Nome: %s\nIdade: %d anos\n", pessoa2.getNome(), pessoa2.calcularIdade(2026));
    }
}
