package br.com.fiap.bean;

public class ContaPoupanca {
    private int numConta;
    private String nomeCliente;
    private float saldo;

    public ContaPoupanca() {
    }
    public ContaPoupanca(int numConta, String nomeCliente, float saldo) {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        setSaldo(saldo);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo");
        }
    }
    public void depositar(float valor){
        if (valor >= 0){
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }
    public void sacar(float valor){
        if (valor <= saldo && valor >= 0){
            saldo -= valor;
        } else {
            System.out.println("Valor inválido para saque");
        }
    }
}