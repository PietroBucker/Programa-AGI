package com.agibank.S2.S2Looping3;

import java.util.Scanner;

public class S2Looping3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero para calcular o fatorial");
        int valor = sc.nextInt();
        int resultadoFatorial = 1;
        for(int i=valor; i>0; i--){
            resultadoFatorial = resultadoFatorial * i;

        }
        System.out.printf("fatoria de %d é: %d", valor, resultadoFatorial);
        sc.close();
    }
}
