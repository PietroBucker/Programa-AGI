package com.agibank.S2.S2Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite valor");
        float valor = sc.nextFloat();

        System.out.println("digite a meidia");
        float media = sc.nextFloat();

        float resultado = (Math.abs(valor - media) / media) * 100;
        System.out.printf("a porcentagem do valor em relação a media é %.2f", resultado);
        sc.close();
    }

}

