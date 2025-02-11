package com.agibank.S2.S2Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.print("digite sua altura em metros ex 1,70: ");
        Scanner sc = new Scanner(System.in);
        float Altura = sc.nextFloat();

        System.out.print("digite seu peso: ");
        sc = new Scanner(System.in);
        float Peso = sc.nextFloat();

        double IMC = Peso/Math.pow(Altura, 2);
        System.out.printf("seu imc é: %.2f \n", IMC);
        if(IMC < 21){
            System.out.println("A baixo Peso");
        } else if (IMC > 28) {
            System.out.println("A cima do peso");
        } else {
            System.out.println("Peso ideal");
        }
        sc.close();
    }
}
