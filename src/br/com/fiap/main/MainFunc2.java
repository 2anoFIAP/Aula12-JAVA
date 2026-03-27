package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.util.Scanner;

public class MainFunc2 {
    public static void main(String[] args) {
        Funcionario func1;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e o quantas horas voce trabalha: ");
            func1 = new Funcionario(scan.next(),scan.nextFloat());
            System.out.printf("Nome: %s\nSalario: %2.f\n", func1.getNome(), func1.calcularSalario(50));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
