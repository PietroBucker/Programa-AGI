package com.agibank.S3.S3Exercicio5;

import java.util.Arrays;

public class S3Exercicio5 {
    public static void main(String[] args) {
        double[] ativos = {100,120,140,120,150};
        double[] variacoes = new double[4];
        double result;

        for(int i=1;i<ativos.length;i++){
            result = ((ativos[i] - ativos[i-1])/ativos[i-1])*100;
            variacoes[i-1] = Math.round(result * 100.0)/100.0;

        }
        System.out.println("Variacoes: " + Arrays.toString(variacoes));
    }
}
