package com.agibank.S2.S2Looping2;

import java.util.Scanner;

public class S2Looping2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalValor = 0;
        double valor;

        System.out.println("digite 0 para calcular");
        System.out.println("para outro clinete digite -1");
        do{
            System.out.println("digite o valor do produto");

            valor = sc.nextDouble();

            if(valor == -1){
                totalValor = 0;
                teste(totalValor);
            }
            totalValor += valor;
        } while (valor != 0);
        teste(totalValor);


        sc.close();
    }
    public static void teste(double totalValor){
        if(totalValor > 1000.00){
            System.out.println("valor com desconto de 12% é: " + totalValor*0.88);
        } else if(totalValor <= 500 && totalValor > 300){
            System.out.println("valor com desconto de 5% é: " + totalValor*0.95);
        }else if(totalValor <= 500 && totalValor < 1000) {
            System.out.println("valor com desconto de 10% é: " + totalValor*0.90);
        }else{
            System.out.println("valor é: " + totalValor);
        }
    }
}
