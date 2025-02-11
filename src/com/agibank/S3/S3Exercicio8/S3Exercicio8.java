package com.agibank.S3.S3Exercicio8;

public class S3Exercicio8 {
    public static void main(String[] args) {
        double[] valCompra = {10000,8000,12000,7000,15000};
        double[] valVenda = {12000,8500,14000,7200,18000};
        double total = 0;

        for(int i = 0; i<valCompra.length; i++){
            total += valVenda[i] - valCompra[i];
        }
        System.out.println("Total: " + total);
        if(total > 20000){
            double imposto = (total - 20000)*0.15;
            System.out.println("Imposto sobre o excedente : " + imposto );
            System.out.println("Total Liquido: " + (total - imposto));

        }else{
            System.out.println("Isento de Iposto");
        }
    }
}
