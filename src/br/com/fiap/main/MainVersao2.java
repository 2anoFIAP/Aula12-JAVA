package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class MainVersao2 {
    public static void main(String[] args) {
        Pessoa pessoa1;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e ano de nascimento: ");
            pessoa1 = new Pessoa(scan.nextLine(),scan.nextInt());
            System.out.printf("Nome: %s\nIdade: %d anos\n", pessoa1.getNome(), pessoa1.calcularIdade(2026));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
