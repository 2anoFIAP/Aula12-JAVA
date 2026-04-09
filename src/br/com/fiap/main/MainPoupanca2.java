package br.com.fiap.main;

import br.com.fiap.bean.ContaPoupanca;
import javax.swing.JOptionPane;

public class MainPoupanca2 {
    public static void main(String[] args) {
        int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial:"));

        ContaPoupanca conta1 = new ContaPoupanca(numConta, nomeCliente, saldo);

        int opcao = 0;

        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opcao:\n"
                            + "1 - Depositar\n"
                            + "2 - Sacar\n"
                            + "3 - Exibir dados\n"
                            + "4 - Sair"));

            if (opcao == 1) {
                float valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para depositar:"));
                conta1.depositar(valorDeposito);
            } else if (opcao == 2) {
                float valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para sacar:"));
                conta1.sacar(valorSaque);
            } else if (opcao == 3) {
                JOptionPane.showMessageDialog(null,
                        "Numero da conta: " + conta1.getNumConta()
                                + "\nNome do cliente: " + conta1.getNomeCliente()
                                + "\nSaldo: " + conta1.getSaldo());
            } else if (opcao == 4) {
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Opcao invalida.");
            }
        }
    }
}