package com.agibank.S2.S2Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("digite a nota");
        Scanner sc = new Scanner(System.in);
        float nota = sc.nextFloat();

        if(nota >= 6 ){
            System.out.println("aprovado");
        } else if (nota < 4) {
            System.out.println("reprovado");
        } else {
            System.out.println("exame");
        }
        sc.close();
    }
}
