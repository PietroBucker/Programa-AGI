package com.agibank.S3.S3Exercicio4;

import java.util.Arrays;
import java.util.stream.Stream;

public class S3Exercicio4 {
    public static void main(String[] args) {
        int[] valores = {1,5,3,4,6,2,8,10,9,7};
        int maior=0, menor = 10000;
        for (int i = 0; i<valores.length; i++){
            if(valores[i]> maior){
                maior = valores[i];
            }
            if(valores[i]< menor){
                menor = valores[i];
            }
        }
        System.out.println("menor: " + menor);
        System.out.println("maior: " + maior);

        int max = Arrays.stream(valores).max().getAsInt();
        int min = Arrays.stream(valores).min().getAsInt();

        System.out.printf("usando array strem menor: %d e maior: %d", min, max);
    }
}
