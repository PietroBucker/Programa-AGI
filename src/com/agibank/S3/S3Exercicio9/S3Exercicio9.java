package com.agibank.S3.S3Exercicio9;

import java.util.Arrays;

public class S3Exercicio9 {
    public static void main(String[] args) {
        double valorInicial = 1000.00;
        double taxa = 0.02;
        double[] valoresFuturos = new double[5];
        valoresFuturos[0] = valorInicial*(1+0.02);
        for(int i =1; i<5; i++){
            valoresFuturos[i] = Math.round((valoresFuturos[i-1]*(1+0.02))*100.0)/100.0;
        }
        System.out.println("Valores Futuros: " + Arrays.toString(valoresFuturos));
    }

}
