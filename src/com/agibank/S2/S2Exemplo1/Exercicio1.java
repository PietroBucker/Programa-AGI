package com.agibank.S2.S2Exemplo1;


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.print("escreva um numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}