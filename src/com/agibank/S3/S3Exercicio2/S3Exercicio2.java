package com.agibank.S3.S3Exercicio2;

public class S3Exercicio2 {
    public static void main(String[] args) {
        double[] ativos = {100,120,140,120,150};
        double result = 1;
        for(int i=1;i<ativos.length;i++){
            result *= (double) ((ativos[i] - ativos[i-1])/ativos[i-1])+1;
        }
        System.out.printf("Aumento de %.2f%%",(result-1)*100);
    }
}
