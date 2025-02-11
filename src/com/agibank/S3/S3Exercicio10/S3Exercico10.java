package com.agibank.S3.S3Exercicio10;

public class S3Exercico10 {
    public static void main(String[] args) {
        double[] valores = {100, 105, 102,110,108,107,95,97,99,103};
        double pico = 0;
        double fundo = Double.MAX_VALUE;
        double result;
        for(int i = 1; i< valores.length; i++){
            if (pico < valores[i]){
                pico = valores[i];
            }
            if(fundo > valores[i]){
                fundo = valores[i];
            }
        }
        result = ((fundo-pico)/pico)*100;
        System.out.printf("DrawDown de: %.2f", result);
    }

}
