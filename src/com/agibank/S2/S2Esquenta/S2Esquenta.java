package com.agibank.S2.S2Esquenta;

import java.util.Scanner;

public class S2Esquenta {
    public static void main(String[] args) {
        //Exercicio1();
        //Exercicio2();
        //Exercicio3();
        //Exercicio3();
        //Exercicio4();

    }

    public static void Exercicio1(){
        Scanner sc = new Scanner(System.in);
        double valor, resultado = 0;

        do {
            System.out.print("Digite um gasto");
            valor = sc.nextDouble();
            if (resultado > 5000){
                System.out.println("Alerta, Seus gastos ultrapassaram R$ 5000,00");
            }
            resultado += valor;
        } while (valor != -1);
        System.out.println("Total Gasto R$: " + resultado);
        sc.close();
    }

    public static void Exercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da divida");
        double divida = sc.nextDouble();
        double valor;
        int count = 1;
        do {
            System.out.printf("Digite o valor do pagamento do mês %d: ", count);
            valor = sc.nextDouble();
            divida -= valor;
            System.out.printf("Mês %d: Saldo restante: %.2f \n", count, divida);
            count++;
        } while (divida > 0);
        System.out.println("Divida Quitada");
        System.out.println("Credito de: R$ " + Math.abs(divida));
        sc.close();
    }

    public static void Exercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o saldo da conta:");
        double saldo = sc.nextDouble();
        double valor;
        int count = 1;
        do {
            System.out.print("Digite o valor do saque");
            valor = sc.nextDouble();
            if(valor < 0){
                break;
            }
            if (valor > saldo){
                System.out.println("ERRO: Saldo insuficiente");
                continue;
            }
            count++;
            saldo -= valor;
            System.out.printf("Saldo restante: R$ %.2f \n", saldo);
        } while (saldo > 0);

        if (saldo > 0){
            System.out.println("saldo restante: R$" + saldo);
        }
        else {
            System.out.println("saldo zerado.");
        }
        sc.close();
    }

    public static void Exercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Taxa de cambio 1 USD = 5 BRL");
        double valor, valorConvert;
        double limiteDiario = 1000;

        while (limiteDiario > 0){
            System.out.println("Digite o valor a ser convertido:");
            valor = sc.nextDouble();
            if(valor <0){
                break;
            }
            if(valor > limiteDiario){
                System.out.println("ERRO: Valor ultrapassa o Limite diario");
                continue;
            }
            valorConvert = valor / 5;
            limiteDiario -= valor;
            System.out.printf("Voce recebera: USD %.2f \n", valorConvert);
        }
        sc.close();
    }
}
