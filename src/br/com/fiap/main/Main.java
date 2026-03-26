package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArCondicionado AC = new ArCondicionado();
        Scanner scan;
        int temperatura; String modo, opcao;
        try {
            scan = new Scanner(System.in);
            System.out.println("Informe a temperatura (15 a 26): ");
            AC.setTemperatura(scan.nextInt());
            System.out.println("Informe o modo (Ventilar, Aquecer ou Resfriar): ");
            AC.setModo(scan.next());

            System.out.println("\n1-Trocar Modo \n2-Nova temperatura \n3-Aumentar Temp \n4-Diminuit Temp: ");
            opcao = scan.next();

            if (opcao.equals("1")){
                System.out.print("Digite o novo modo: ");
                AC.setModo(scan.next());
            } else if (opcao.equals("2")){
                System.out.println("Defina nova temperatura: ");
                AC.setTemperatura(scan.nextInt());
            } else if (opcao.equals("3")){
                System.out.println("Aumente a temperatura: ");
                AC.aumentarTemperatura();
            } else if (opcao.equals("4")) {
                System.out.println("Diminua a Temperatura: ");
                AC.diminuirTemperatura();
            } else {
                throw new Exception("Informacoes Invalidas!");
            }
        } catch (Exception e) {
            System.out.println("Formato invalido");
        }
    }
}
