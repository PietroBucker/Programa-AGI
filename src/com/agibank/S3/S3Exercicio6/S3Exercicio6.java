package com.agibank.S3.S3Exercicio6;

public class S3Exercicio6 {
    public static void main(String[] args) {
        int[] valores = {100,103,101,104,105,106,108,107,110,111 };
        int maior=0, menor = 0;
        for (int i = 1; i<valores.length; i++){
            if(valores[i -1] < valores[i]){
                maior += 1;
            }
            if(valores[i -1] > valores[i]){
                menor += 1;
            }
        }
        System.out.println("Baixa: " + menor);
        System.out.println("Alta: " + maior);
    }
}
