package br.com.fiap.main;

import br.com.fiap.bean.ContaPoupanca;

public class MainPoupanca1 {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca();
        conta1.setNomeCliente("Maria");
        conta1.setNumConta(12345);
        conta1.setSaldo(1000);
        System.out.printf("Número da conta: %d\nNome do cliente: %s\nSaldo: %.2f reais\n", conta1.getNumConta(), conta1.getNomeCliente(), conta1.getSaldo());
        conta1.depositar(500);
        System.out.printf("Saldo após depósito: %.2f reais\n", conta1.getSaldo());
        conta1.sacar(200);
        System.out.printf("Saldo após saque: %.2f reais\n", conta1.getSaldo());
    }
}