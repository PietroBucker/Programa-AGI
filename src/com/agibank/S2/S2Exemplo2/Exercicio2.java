package com.agibank.S2.S2Exemplo2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.print("escreva um numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        sc.close();
    }
}
