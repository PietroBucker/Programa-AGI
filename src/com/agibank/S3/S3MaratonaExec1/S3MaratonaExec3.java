package com.agibank.S3.S3MaratonaExec1;

public class S3MaratonaExec3 {
    public static void main(String[] args) {
        double rendaMensal = 0;
        double saidaAcumulada = 10000000;
        double taxaDeJuros = 0;
        int expectativaDeVida = 20;
        double expoente = 1 /(expectativaDeVida * 12);
        double total = 1;


        double[] jurosMensal = new double[4];
        jurosMensal = new double[]{0.04, 0.06, 0.08, 0.010};


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < jurosMensal.length; j++) {
                rendaMensal = saidaAcumulada * (jurosMensal[j] / (1 - Math.pow(1+jurosMensal[j], - 20*12)));
            //erro de logica a conta (-10)
            }
            System.out.println();
            //Saida imcompleta (-5)
        }
        System.out.println(rendaMensal);
        //Saida precisa ser Saldo acumulado no momento da aposentadoria (-10)


    }
}
