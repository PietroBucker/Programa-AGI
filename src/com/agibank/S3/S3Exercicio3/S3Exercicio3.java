package com.agibank.S3.S3Exercicio3;

public class S3Exercicio3 {
    public static void main(String[] args) {
        double[] valores = {1,2,3,4,5,6,7};
        int size = valores.length;
        double result = (valores[size-3] + valores[size-2] + valores[size-1])/3;
        System.out.printf("Media movel de %.2f",result);
    }
}
