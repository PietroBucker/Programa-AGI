package com.agibank.S3.S3Exercicio7;

import java.util.Arrays;

public class S3Exercicio7 {
    public static void main(String[] args) {
        double[] acoes = {5000,3000,7000,4000,6000};
        double[] percent = new double[5];
        double acc=0;
        for(double acao: acoes){
            acc += acao;
        }
        for(int i =0; i<acoes.length; i++){
            percent[i] = (Math.round(((acoes[i]/acc)*100)*100.0)/100.0);
        }
        System.out.println("soma: " + acc);
        System.out.println("soma" + Arrays.toString(percent));
    }
}
