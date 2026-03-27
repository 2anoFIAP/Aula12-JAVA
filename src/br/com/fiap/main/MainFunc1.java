package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class MainFunc1 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.setNome("Joao");
        func1.setValorHoraTrabalho(50);
        float salario = func1.calcularSalario(45);
        LocalDate dataAtual = LocalDate.now();
        System.out.printf("Nome: %s\nSalario: %.2f reais\nDate: %d/%s/%d\n", func1.getNome(), salario,dataAtual.getDayOfMonth(), dataAtual.getMonth(), dataAtual.getYear());

    }
}
